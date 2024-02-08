package JavaStudy.JavaSE.Middle.JavaArrayList;

import java.util.ArrayList;

public class MainJavaArrayList {
    public static void main(String[] args) {
        // ArrayList的类型只能是包装类(容量可动态变化)
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        // 在指定位置插入元素
        arrayList.add(2, -1);
        // 修改元素
        arrayList.set(0, 100);
        System.out.println(arrayList.size());
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println("\n###################################");

        arrayList.remove(2);
        System.out.println(arrayList.size());
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println(arrayList.get(0));
        arrayList.clear();
        // System.out.println(arrayList.size());
    }
}
