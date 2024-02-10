package JavaSE.JavaStudy.JavaSE.Senior.JavaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class MainJavaIO {
    private static ArrayList<Character> content = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName = "F:\\Code\\Java\\JavaStudy\\JavaSE\\Senior\\JavaIO\\hello.txt";
        // String fileName = "hello.txt";
        MainJavaIO main = new MainJavaIO();
//        main.writeByteFile(fileName);
//        main.readByteFile(fileName);
//        System.out.println(contentToString(content));
//        main.readCharFile(fileName);
//        main.writeCharFile(fileName);
        // main.createFile();
        // main.getFileInfo(fileName);
        // main.deleteFile();
        main.getDiskInfo();
        // System.out.println(content);
    }

    // 文件字节流
    public void readByteFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){
            // 跳读文件
            // fileInputStream.skip(3);
            int i;
            // available读取文本文件的全部内容(仅支持文本文件, 二进制文件未知 ps:如果文件过大不建议使用, 可能会导致内存溢出)
            byte[] bytes = new byte[fileInputStream.available()];
            // System.out.println(fileInputStream.available());
            while (fileInputStream.read(bytes) != -1) {
                System.out.println(new String(bytes));
            }
            while ((i = fileInputStream.read()) != -1) {
                // System.out.println((char) i);
                content.add((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeByteFile(String fileName) {
        // true附加写入文件
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true)){
            fileOutputStream.write("success!".getBytes(), 3, 3);
            // 刷新->缓存机制立即生效
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 文件字符流
    public void readCharFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)){
            System.out.println((char) fileReader.read());
            System.out.println(fileReader.getEncoding());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCharFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // 两种方法都可以写文件
            fileWriter.write("Hello World!");
            fileWriter.append("admin!");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile() throws IOException {
        File file = new File("F:\\Code\\Java\\JavaStudy\\JavaSE\\Senior\\JavaIO\\new.txt");
        System.out.println(file.createNewFile());
    }

    public void deleteFile() {
        File file = new File("F:\\Code\\Java\\JavaStudy\\JavaSE\\Senior\\JavaIO\\new.txt");
        System.out.println(file.delete());
    }

    public void getFileInfo(String fileName) {
        File file = new File(fileName);
        System.out.println(file.length());
    }

    public void getDiskInfo() {
        File file = new File("F:\\");
        // 获取剩余内存空间
        System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024 + "G");
        // 读取该目录下的所有文件、目录
        for (String s : Objects.requireNonNull(file.list())) {
            System.out.println(s);
        }
    }


    private static String contentToString(ArrayList<Character> content) {
        StringBuilder stringBuilder = new StringBuilder(content.size());
        for (Character character : content) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
