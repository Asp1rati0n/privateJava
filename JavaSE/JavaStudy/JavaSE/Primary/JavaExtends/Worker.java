package JavaSE.JavaStudy.JavaSE.Primary.JavaExtends;

public class Worker extends Person{
    String name;

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void work() {
        // 访问父类属性(supper只能向上访问一级, 不能横跨多级)
        System.out.println("I am " + super.name + ", I am working!");
    }

//    @Override
//    public void study() {
//        System.out.println("I am a worker! It's hard for me to get A class!");
//    }
}
