package JavaStudy.JavaSE.Primary.JavaRegularExpression;

public class MainJavaRegularExpression {
    public static void main(String[] args) {
        String email = "helloworld@163.com";
        // 判断字符串是否是邮箱

        String str1 = "aaa";
        // + 匹配一次或多次
        System.out.println(str1.matches("o+"));
        // * 匹配 0 次或多次
        System.out.println(str1.matches("o*a{3}"));

        String str2 = "bca";
        // 只要 abc 三个字符任意一个字符出现一次就为 true
        System.out.println(str2.matches("[abc]*"));
        String str3 = "xyz";
        // 不包含 abc 三个字符中任意一个字符的字符串都为 true
        System.out.println(str3.matches("[^abc]*"));

    }
}
