package JavaStudy.JavaSE.Primary.JavaInnerClass;

public class AnonymousTest {

    public static String anonymoustest = "";

    static {
        System.out.println("Outer Class!");
    }

    public static class Inner {
        static {
            System.out.println("Inner Class");
        }

        public static void anonymoustest() {
            System.out.println("I am Static Inner Class");
        }
    }
}
