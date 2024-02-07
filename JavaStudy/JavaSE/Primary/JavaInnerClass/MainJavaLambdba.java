package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class MainJavaLambdba {
    public static void main(String[] args) {
        // 如果一个接口中有且只有一个待实现(必须实现)的抽象方法, 那么我们可以将匿名内部类简写为 Lambda 表达式
        // Lambda expression(注: Lambda 仅支持接口)
        Study study = () -> System.out.println("I am Anonymous Inner Class Interface!");
        study.study();
    }
}
