package JavaStudy.JavaSE.Primary.JavaPackageClass;

import java.math.BigInteger;

public class mainJavaPackageClass2 {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        i = 100;
        System.out.println(i);

        BigInteger j = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger result = j.multiply(BigInteger.valueOf(Long.MAX_VALUE));

        System.out.println(j);
        System.out.println(result);
        System.out.println(Long.MAX_VALUE);
        // 溢出
        System.out.println(Long.MAX_VALUE * Long.MAX_VALUE);
    }
}
