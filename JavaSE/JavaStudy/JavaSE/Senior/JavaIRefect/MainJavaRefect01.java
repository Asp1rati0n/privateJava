package JavaSE.JavaStudy.JavaSE.Senior.JavaIRefect;

public class MainJavaRefect01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Class对象
        Class<Student> clazz1 = Student.class;
        Class<?> clazz2 = new Student().getClass();
        Class<?> clazz3 = Class.forName("JavaSE.JavaStudy.JavaSE.Senior.JavaIRefect.Student");
        Class<?> clazz4 = int.class;

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);

    }
}
