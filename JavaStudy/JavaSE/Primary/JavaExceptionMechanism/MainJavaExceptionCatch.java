package JavaStudy.JavaSE.Primary.JavaExceptionMechanism;

public class MainJavaExceptionCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            System.out.println(arr[-1]);
//            Object object = null;
//            object.toString();
            System.out.println(test(1, 0));
            System.out.println(test(2, 1));
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            // 打印报错信息
            // e.printStackTrace();
            System.out.println("Null Point Error or Array Index Out Of Error!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            // 无论程序有没有异常都会执行 finally
            System.out.println("Finally Error!");
        }
        System.out.println("Process is normally running!");
    }

    private static int test(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("b can't be 0!");
        return a / b;
    }
}
