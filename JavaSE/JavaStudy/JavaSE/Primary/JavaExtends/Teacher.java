package JavaSE.JavaStudy.JavaSE.Primary.JavaExtends;

public class Teacher extends Person implements Study{
    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void study() {
        System.out.println("I am better!");
    }

    @Override
    public void test() {
        Study.super.test();
    }
}
