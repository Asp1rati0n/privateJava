package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class Test {

    private final String name;

    public Test(String name) {
        this.name = name;
        // 外部不能访问内部成员变量
        // System.out.println(test);
    }

    public class Inner {
        String name;
        public void test(String name) {
            System.out.println("I am Inner Class!" + this.name);
            System.out.println("I am Inner Class!" + Test.this.name);
        }
    }
}
