package JavaSE.JavaStudy.JavaSE.Primary.JavaPackageClass;

public class mainJavaPackageClass1 {
    public static void main(String[] args) {
        String str = "666";
        // 字符串转数字
        Integer i = new Integer(str);
        Integer j = Integer.valueOf(str);
        Integer k = Integer.parseInt(str);

        // 十六进制转十进制
        Integer x = Integer.decode("0xAA");
        // 八进制转十进制
        Integer y = Integer.decode("077");

        Integer z = 16;

        Integer a = new Integer(10);
        Integer b = new Integer(10);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        System.out.println(x);
        System.out.println(y);
        // 十进制转十六进制
        System.out.println("0x" + Integer.toHexString(z));
        // 判断值是否相等 不比较对象是否相等
        System.out.println(a.equals(b));
    }
}
