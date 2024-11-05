package design_patterns.proxy.remote_caching;

class Main {
    public static void main(String[] args) {
        RemoteService remoteService = new NetworkRemoteService();
        RemoteService proxy = new RemoteServiceProxy(remoteService);

        System.out.println(proxy.fetchData("car"));
        System.out.println(proxy.fetchData("toy"));
    }
}