package design_patterns.proxy.file_download;

class Main {
    public static void main(String[] args) {
        FileDownloadService fileService = new RemoteFileDownloadService();
        FileDownloadService proxy = new FileDownloadProxy(fileService, "ahurein");

        proxy.downloadFile("file.txt");
    }
}