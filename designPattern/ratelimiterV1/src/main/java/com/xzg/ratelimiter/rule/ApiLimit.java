package com.xzg.ratelimiter.rule;

public class ApiLimit {
    private static final int DEFAULT_TIME_UINT = 1; // 1 second
    private String api;
    private int limit;
    private int uint = DEFAULT_TIME_UINT;

    public ApiLimit() {}

    public ApiLimit(String api, int limit) {
        this(api, limit, DEFAULT_TIME_UINT);
    }

    public ApiLimit(String api, int limit, int uint) {
        this.api = api;
        this.limit = limit;
        this.uint = uint;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getUint() {
        return uint;
    }

    public void setUint(int uint) {
        this.uint = uint;
    }
}
