package JavaSE.JavaStudy.JavaSE.Middle.JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainJavaStream {
    public static void main(String[] args) {
        // stream流java8新增
        List<String> list1 = new ArrayList<>(Arrays.asList("aaaa", "Sadsa", "Sadsa", "xx", "add", "Xss", "Lbwnb"));
        // 1、删除长度不大于3的字符串
        // 2、删除首字母为小写字母的字符串
        // 3、取出重复的字符串
        list1 = list1.stream()
                // filter保留满足条件的元素(使用断言表达式)
                .filter(str -> str.length() > 3)
                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
                // 去重
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(Arrays.asList("aaaa", "Sadsa", "Sadsa", "xx", "add", "Xss", "Lbwnb"));
        List<Integer> collect = list2.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);

        Random random = new Random();
        random
                .ints(-100, 100)
                .limit(10)
                .filter(i -> i > 0)
                .sorted()
                .forEach(System.out::println);
    }
}
