package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class MainJavaInnerClass {
    public static void main(String[] args) {
        Test a = new Test("zhangsan");
        // 成员内部类
        Test.Inner inner1 = a.new Inner();
        inner1.test("zhangsan");

        Test b = new Test("lisi");
        Test.Inner inner2 = b.new Inner();
        inner2.test("lisi");
    }
}
