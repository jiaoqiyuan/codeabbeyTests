package com.xzg.ratelimiter;


import com.xzg.ratelimiter.alg.FixedTimeWinRateLimitAlg;
import com.xzg.ratelimiter.rule.ApiLimit;
import com.xzg.ratelimiter.rule.RateLimitRule;
import com.xzg.ratelimiter.rule.RuleConfig;
import com.xzg.ratelimiter.rule.TrieRateLimitRule;
import com.xzg.ratelimiter.rule.datasource.FileRuleConfigSource;
import com.xzg.ratelimiter.rule.datasource.RuleConfigSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
    private static final Logger log = LoggerFactory.getLogger(RateLimiter.class);
    // 为每个 api 在内存中存储限流计数器
    private ConcurrentHashMap<String, FixedTimeWinRateLimitAlg> counters = new ConcurrentHashMap<>();
    private RateLimitRule rule;

    public RateLimiter() {
        // 将限流规则配置文件 ratelimiter-rule.yaml 中的内容读取到 RuleConfig 中
        RuleConfigSource configSource = new FileRuleConfigSource();
        RuleConfig ruleConfig = configSource.load();
        this.rule = new TrieRateLimitRule(ruleConfig);
    }

    public boolean limit(String appId, String url) throws InternalError {
        ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取 api 对应在内存中的限流计数器 rateLimitCounter
        String counterKey = appId + ":" + apiLimit.getApi();
        FixedTimeWinRateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            FixedTimeWinRateLimitAlg newRateLimitCounter = new FixedTimeWinRateLimitAlg(apiLimit.getLimit());
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }

}
