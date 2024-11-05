package design_patterns.proxy.file_download;

class FileDownloadProxy implements FileDownloadService {
    private final FileDownloadService realService;
    private final String authorizedUser;

    public FileDownloadProxy(FileDownloadService realService, String authorizedUser) {
        this.realService = realService;
        this.authorizedUser = authorizedUser;
    }

    private boolean isUserAuthorized(String currentUser) {
        return currentUser.equals(authorizedUser);
    }

    @Override
    public void downloadFile(String filePath) {
        System.out.println("Authorization check for user: " + "ahurein");

        if (!isUserAuthorized("ahurein")) {
            System.out.println("Unauthorized access! Download is not allowed.");
            return;
        }

        System.out.println("User authorized. Starting download...");
        realService.downloadFile(filePath);
    }
}