package JavaSE.JavaStudy.JavaSE.Primary.JavaArray;

public class mainJavaMultiArrayList {
    public static void main(String[] args) {
        int[][] arrayList = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(arrayList[1][1]);

        int[] a = arrayList[0];
        int[] b = arrayList[1];
        // arrayList[0] = new int[]{0, 0, 0, 0};
        System.out.println(arrayList[0][2]);
        // 3
        System.out.println(a[2]);
        // 遍历二维数组
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList[i].length; j++) {
                System.out.print(arrayList[i][j] + " ");
            }
            System.out.println();
        }
    }
}
