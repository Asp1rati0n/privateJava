package JavaSE.JavaStudy.JavaSE.Primary.JavaExtends;

public interface A{
    default void test() {
        System.out.println("I am default implementation!");
    }

    // 接口中的默认方法(default)不能重写 java.lang.Object 的成员(下面的代码报错)
    /*
    default boolean equals(Object obj) {

    }
     */
}
