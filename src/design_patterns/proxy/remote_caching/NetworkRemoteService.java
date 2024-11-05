package design_patterns.proxy.remote_caching;

public class NetworkRemoteService implements RemoteService {
    @Override
    public String fetchData(String request) {
        System.out.println("Fetching data from the remote server for request: " + request);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data for " + request;
    }
}
