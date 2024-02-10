package JavaSE.JavaStudy.JavaSE.Primary.JavaClass.Demo1;

public class Person {
    // 定义类的属性(成员变量)
    private String name;
    private int age;
    private String sex;
    // 静态变量(类的属性)
    static String info;

    // 静态代码块可用于初始化静态变量
    static {
        info = "test";
    }

    void hello() {
        System.out.println("my name is " + name + " age:" + age + " sex:" + sex);
    }

    int sum(int a, int b) {
        return a + b;
    }

    // method reload
    double sum(double a, double b) {
        return a + b;
    }

    // 当参数名和变量名相同时需要用 this 关键字
    void setAge(int age) {
        this.age = age;
    }

    static void demo() {
        System.out.println("static method demo");
    }

    private Person() {}
//    public Person(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    // 内部决定如何构造对象(封装的思想)
    public static Person getInstance() {
        Person person = new Person();
        person.name = "1";
        return person;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
//
//    {
//        System.out.println("code chunk!");
//    }
}
