package com.xzg.ratelimiter.rule;

import com.xzg.ratelimiter.rule.ApiLimit;
import com.xzg.ratelimiter.rule.RateLimitRule;

public class TrieRateLimitRule extends RateLimitRule {
    public TrieRateLimitRule(RuleConfig ruleConfig) {
        super(ruleConfig);
    }

    @Override
    public ApiLimit getLimit(String appId, String api) {
        return null;
    }
}
