package JavaSE.JavaStudy.JavaSE.Middle.JavaCollectionClass;

import java.util.ArrayList;

public class MainJavaCollectionClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "aaa");
        list.add(0, "bbb");
        System.out.println(list);
        System.out.println(list.contains("aaa"));
    }
}
