package JavaStudy.JavaSE.Primary.JavaClass.Demo;

// import package
import JavaStudy.JavaSE.Primary.JavaClass.Demo1.Person;

public class helloPackageImport {
    public static void main(String[] args) {
//        Person p = new Person("zhangsan", 18, "male");
        Person p = Person.getInstance();
        System.out.println(p.getName());
    }
}
