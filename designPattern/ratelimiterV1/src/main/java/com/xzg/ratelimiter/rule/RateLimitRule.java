package com.xzg.ratelimiter.rule;

public abstract class RateLimitRule {
    public RateLimitRule(RuleConfig ruleConfig) {
        // ...
    }

    public abstract ApiLimit getLimit(String appId, String api);
}
