package JavaSE.JavaStudy.JavaSE.Primary.JavaString;

public class MainJavaString {
    public static void main(String[] args) {
        // 字符串也是引用类型
        String str1 = "Hello World!";
        String str2 = "Hello World!";
        // 引用类型创建字符串
        String str3 = new String("I am a String!");
        String str4 = new String("I am a String!");
        System.out.println(str1);
        // true
        System.out.println(str1 == str2);
        // false
        System.out.println(str3 == str4);
        // 判断内容是否相同
        System.out.println(str3.equals(str4));
        // 获取长度
        System.out.println(str1.length());
        System.out.println("Successfully!".length());

        // 字符串裁剪(索引不能为负数)
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1, 5));
        // 裁剪后5个字符
        System.out.println(str1.substring(str1.length()-5));
        // 按字符分割
        String[] str = str1.split(" ");
        for (String s : str) {
            System.out.println(s);
        }
        // System.out.println();
        // 字符串转数组
        char[] ch = str1.toCharArray();
        System.out.println(ch[0]);

        // 判断字符串是否包含某个子串(区分大小写)
        System.out.println(str1.contains("Hello"));
        System.out.println(str1.charAt(0));
        // 大小写转换(返回新的字符串)
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);

        System.out.println(str1.startsWith("Hello"));
        // 寻找某个子串第一次出现的位置
        System.out.println(str1.indexOf("l"));
        // 寻找某个子串最后一次出现的位置
        System.out.println(str1.lastIndexOf("l"));
    }
}
