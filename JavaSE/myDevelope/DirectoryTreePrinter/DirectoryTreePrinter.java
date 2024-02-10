package JavaSE.myDevelope.DirectoryTreePrinter;

import java.io.File;

public class DirectoryTreePrinter {
    public static void printDirectoryTree(String path, int depth) {
        File directory = new File(path);
        if (!directory.exists()) {
            System.out.println("Directory not found: " + path);
            return;
        }

        printDirectoryContents(directory, depth);
    }

    private static void printDirectoryContents(File directory, int depth) {
        if (directory.isDirectory()) {
            printIndent(depth);
            System.out.println("[" + directory.getName() + "]");
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        printDirectoryContents(file, depth + 1);
                    } else {
                        printIndent(depth + 1);
                        System.out.println(file.getName());
                    }
                }
            }
        } else {
            System.out.println("[" + directory.getName() + "]");
        }
    }

    private static void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  "); // Adjust the indentation as needed
        }
    }

    public static void main(String[] args) {
        String directoryPath = "F:\\Code\\C\\book"; // 修改为实际的目录路径
        printDirectoryTree(directoryPath, 0);
    }
}
