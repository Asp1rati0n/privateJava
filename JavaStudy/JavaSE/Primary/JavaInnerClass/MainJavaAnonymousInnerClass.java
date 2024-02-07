package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class MainJavaAnonymousInnerClass {
    public static void main(String[] args) {
        // 匿名内部类
        Student student = new Student() {
            @Override
            public void test() {
                System.out.println("I am Anonymous Inner Class!");
            }
        };
        student.test();

        Study study = new Study() {
            @Override
            public void study() {
                System.out.println("I am Anonymous Inner Class Interface!");
            }
        };
        study.study();
    }
}
