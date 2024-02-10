package JavaSE.JavaStudy.JavaSE.Primary.JavaArray;

public class mainJavaVarLengthParameter {
    public static void main(String[] args) {
        test(1,"Hello", "World", "Test");
        test(1);
    }

    // 可变长参数只能放到最后 不允许出现多个可变长度的参数(最多有一个)
    private static void test(int a, String... str) {
        for (String s : str) {
            System.out.println(s);
        }
    }
}
