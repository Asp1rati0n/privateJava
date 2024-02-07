package JavaStudy.JavaSE.Primary.JavaEnumClass;

public class mainJavaEnumClass {
    public static void main(String[] args) {
        /*
        Student student = new Student();
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus());

        Status status = Status.valueOf("RUNNING");
        System.out.println(status);
         */

        Student student = new Student();
        student.setStatus(Status.STUDY);
        System.out.println(student.getStatus().getName());
    }
}
