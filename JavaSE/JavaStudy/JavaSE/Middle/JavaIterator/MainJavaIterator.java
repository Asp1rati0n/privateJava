package JavaSE.JavaStudy.JavaSE.Middle.JavaIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainJavaIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Iterator var = list.listIterator();

        while (var.hasNext()) {
            String s = (String) var.next();
            System.out.println(s);
        }

    }
}
