package AllData;

public class File {
    public File(String fileName, String fileEnd, double fileSize) {
        FileName = fileName;
        FileEnd = fileEnd;
        FileSize = fileSize;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileEnd() {
        return FileEnd;
    }

    public void setFileEnd(String fileEnd) {
        FileEnd = fileEnd;
    }

    public double getFileSize() {
        return FileSize;
    }

    public void setFileSize(double fileSize) {
        FileSize = fileSize;
    }

    private String FileName;
    private String FileEnd;
    private double FileSize;

    @Override
    public String toString() {
        return "File{" +
                "File Name='" + FileName + '\'' +
                ", File End='" + FileEnd + '\'' +
                ", File Size=" + FileSize +
                '}';
    }
}
