package JavaSE.JavaStudy.JavaSE.Primary.JavaInnerClass;

public class MainJavaInnerClass1 {
    public static void main(String[] args) {
        AnonymousTest.Inner.anonymoustest();
        // 明确使用外部类 外部类才会初始化
        System.out.println(AnonymousTest.anonymoustest);
    }
}
