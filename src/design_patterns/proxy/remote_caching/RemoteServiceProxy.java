package design_patterns.proxy.remote_caching;

import java.util.HashMap;
import java.util.Map;

class RemoteServiceProxy implements RemoteService {
    private final RemoteService realService;
    private final Map<String, String> cache;

    public RemoteServiceProxy(RemoteService realService) {
        this.realService = realService;
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String request) {
        if (cache.containsKey(request)) {
            System.out.println("Returning cached result: " + request);
            return cache.get(request);
        }

        String response = realService.fetchData(request);
        cache.put(request, response); // Cache the response
        return response;
    }
}