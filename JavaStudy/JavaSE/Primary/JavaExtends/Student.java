package JavaStudy.JavaSE.Primary.JavaExtends;

// implements 实现接口
public class Student extends Person implements Study, Cloneable{
//    子类需要初始化父类的属性
    public Student(String name, int age, String sex) {
//        调用父类(超类)的调用方法 (前面不能有任何代码)
        super(name, age, sex);
//        super("zhangsan", 18, "male");
    }

    @Override
    public void study() {
        // 使用父类定义的属性
        System.out.println("I am a Student! My Name is " + name);
    }

    // 修改访问权限 protected 为 public
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
