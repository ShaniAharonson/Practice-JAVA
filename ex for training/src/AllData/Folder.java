package AllData;

public class Folder {


    public Folder(String folderName, File[] files) {
        FolderName = folderName;
        this.files = files;
    }

    public String getFolderName() {
        return FolderName;
    }

    public void setFolderName(String folderName) {
        FolderName = folderName;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    private String FolderName;
    private File[] files;

    public void totalFilesSize(int size) {
        int totalSizes = 0;
        for (int i = 0; i < files.length; i++) {
            totalSizes += (int) files[i].getFileSize();

        }
        System.out.println(totalSizes);

    }

    public String maxFileSize() {
        int max = Integer.MIN_VALUE;
        String maxFileName = " ";
        for (int i = 0; i < files.length; i++) {
            if (files[i].getFileSize() > max) {
                max = (int) files[i].getFileSize();
                maxFileName = files[i].getFileName();
            }
        }
        return maxFileName;
    }

    public String minFileSize() {
        int min = Integer.MAX_VALUE;
        String minFileName = " ";
        for (int i = 0; i < files.length; i++) {
            if (files[i].getFileSize() < min) {
                min = (int) files[i].getFileSize();
                minFileName = files[i].getFileName();
            }

        }
        return minFileName;
    }


}
