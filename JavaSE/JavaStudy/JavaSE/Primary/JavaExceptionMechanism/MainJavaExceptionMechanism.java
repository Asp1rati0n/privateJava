package JavaSE.JavaStudy.JavaSE.Primary.JavaExceptionMechanism;

public class MainJavaExceptionMechanism {
    public static void main(String[] args) {
        System.out.println(test(1, 0));
    }

    private static int test(int a, int b) {
        return a / b;
    }
}
