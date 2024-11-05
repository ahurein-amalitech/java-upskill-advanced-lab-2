package design_patterns.proxy.file_download;

class RemoteFileDownloadService implements FileDownloadService {
    @Override
    public void downloadFile(String filePath) {
        System.out.println("Downloading file: " + filePath);
        for (int i = 1; i <= 100; i += 20) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Download progress: " + i + "%");
        }
        System.out.println("Download completed for file: " + filePath);
    }
}