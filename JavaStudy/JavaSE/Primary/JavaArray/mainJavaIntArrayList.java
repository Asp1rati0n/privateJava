package JavaStudy.JavaSE.Primary.JavaArray;

public class mainJavaIntArrayList {
    public static void main(String[] args) {
        // 声明数组的三种方式
        // 数组类型也是类 继承 Object 类 编程不可见
        int[] arrayList1 = {3, 4, 5, 6, 7};
        // 创建引用类型的对象 (默认值为0)
        int[] arrayList2 = new int[10];
        int[] arrayList3 = new int[]{1, 3, 5, 7};

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        int[] clone = arrayList1.clone();

        // false
        System.out.println(clone == arrayList1);

        for (int i: clone) System.out.print(i + " ");
        System.out.println();

        // 判断两个数组元素是否相等
        if (equals(a, b)) System.out.println("array a equal to array b!");
        else System.out.println("array a is not equal to array b!");

//         for (int e: arrayList1) System.out.println(e);
//         for (int e: arrayList2) System.out.println(e);
//         for (int e: arrayList3) System.out.println(e);

        // System.out.println("arrayList1 length:" + arrayList1.length);
    }

    public static boolean equals(int[] a, int[] b) {
        // 判断两个数组长度是否相等
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
