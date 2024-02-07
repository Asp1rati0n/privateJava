package JavaStudy.JavaSE.Primary.JavaString;

public class MainJavaStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("AAA");
        builder.append("BBB");
        builder.replace(0, 3, "CCC");
        builder.reverse();
        builder.append("xxx").append("yyy");
        // 使用 toString 转换为字符串
        System.out.println(builder.toString());
    }
}
