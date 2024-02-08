package JavaStudy.JavaSE.Middle.JavaMap;

import java.util.HashMap;
import java.util.Map;

public class MainJavaMap {
    public static void main(String[] args) {
        // 类型只能是包装类
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map);
        System.out.println(map.containsValue("lisi"));
        System.out.println(map.containsKey(1));
        // 返回所有的键
        System.out.println(map.keySet());
        map.remove(1);
        System.out.println(map);
        map.clear();
    }
}
