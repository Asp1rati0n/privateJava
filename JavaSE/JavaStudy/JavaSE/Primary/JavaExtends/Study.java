package JavaSE.JavaStudy.JavaSE.Primary.JavaExtends;

// 接口里面只能有抽象方法、静态变量和静态方法
public interface Study {
    public static final int a = 10;

    public static void xxx() {
        System.out.println("xxx");
    }

    public abstract void study();

    // default 抽象方法默认实现(抽象方法有默认实现就不需要在子类中重写)
    default void test() {
        System.out.println("I am default implementation!");
    }
}
