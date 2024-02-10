package JavaSE.myDevelope.myCatalogReader;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String root = "F:\\";
        main.getFolder(root);
    }

    public void getFolder(String root) {
        File file = new File(root);
        for (String s : Objects.requireNonNull(file.list())) {
//            System.out.println(s);
//            System.out.println(root + s);
            String path = root + s;
            System.out.println(path);
            if (fileTypeCheck(path)) {
                System.out.println("folder: " + path);
            } else {
                System.out.println("file: " + path);
            }
        }
    }

    public boolean fileTypeCheck(String path) {
        File file = new File(path);
        return file.isDirectory();
    }
}
