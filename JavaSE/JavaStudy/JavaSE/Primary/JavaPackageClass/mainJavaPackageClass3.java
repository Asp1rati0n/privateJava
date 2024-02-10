package JavaSE.JavaStudy.JavaSE.Primary.JavaPackageClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class mainJavaPackageClass3 {
    public static void main(String[] args) {
        BigDecimal i = BigDecimal.valueOf(10);
        // 精确到小数点后 100 位向上取整
        BigDecimal result = i.divide(BigDecimal.valueOf(3), 100, RoundingMode.CEILING);
        System.out.println(result);
        // 向下取整
        result = i.divide(BigDecimal.valueOf(3), 100, RoundingMode.FLOOR);
        System.out.println(result);
    }
}
