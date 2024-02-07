package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class StaticTest {
    private final String name;

    public StaticTest(String name) {
        this.name = name;
        System.out.println(Inner.test);
    }

    public static class Inner {
        static String test;
        public void test() {
            // 局部变量
            int a = 10;
            System.out.println("I am Static Inner Class!");
        }
    }
}
