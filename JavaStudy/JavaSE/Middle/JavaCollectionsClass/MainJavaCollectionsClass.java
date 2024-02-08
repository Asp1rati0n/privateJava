package JavaStudy.JavaSE.Middle.JavaCollectionsClass;

import java.util.*;

public class MainJavaCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 9, -1));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        // 在集合中必须相邻
        System.out.println(Collections.indexOfSubList(list, Arrays.asList(1, 4)));
        Collections.fill(list, 0);
        System.out.println(list);
    }
}
