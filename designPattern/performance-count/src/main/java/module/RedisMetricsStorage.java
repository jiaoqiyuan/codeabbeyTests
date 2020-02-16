package module;

import service.RequestInfo;

import java.util.List;
import java.util.Map;

public class RedisMetricsStorage implements MetricsStorage {
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    public List getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
