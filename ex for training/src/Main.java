import AllData.File;
import AllData.Folder;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[5];
        for (int i = 0; i < files.length; i++) {
            files[i] = new  File("file"+i, "zip", 5.55+i);

            System.out.println(files[i]);
        }

        Folder folder = new Folder("All Data",files);
        System.out.println(folder);

    }

}