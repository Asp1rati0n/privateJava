package JavaStudy.JavaSE.Middle.JavaGenericity;

import java.util.Arrays;

public class MainJavaGenericity {
    public static void main(String[] args) {
//        Score s1 = new Score("Math", "xxxx", 90);
//        Score s2 = new Score("Computer Network", "xxx", "优秀");
//
//        Integer i = (Integer) s2.getValue();
        // 只能使用包装类(Integer, 数组可以) 不能使用基本数据类型 如int
        Score<String, Integer> s1 = new Score<String, Integer>("Math", "xxxx", 90);
        Score<String, String> s2 = new Score<String, String>("Computer Network", "xxx", "优秀");
        // ? 通配符 代表任意类型
        Score<String, ?> s3 = new Score<>("Computer Network", "xxx", "优秀");

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

//        A a = new A();
//        a.test();

        String str1 = test("xxx");
        Integer str2 = test(10);

        Integer[] arr = {1, 4, 5, 2, 6, 3, 0, 7, 9, 8};
        Arrays.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

        ScoreScope<Integer> ss1 = new ScoreScope<>("MATH", "XXX", 10);
        // String 超出泛型界限->报错
        // ScoreScope<String> ss2 = new ScoreScope<String>("Computer Network", "良好");
        ScoreScope<?> ss3 = new ScoreScope<Double>("English", "xxx", 2.0);
        // 2.0 属于 double 类型, 泛型确定为 Integer 类型, 类型不一致->报错
        // ScoreScope<? extends Integer> ss4 = new ScoreScope<Double>("English", "xxx", 2.0);
        // supper 设置泛型下界
        // ScoreScope<? super Objects> ss5 = new ScoreScope<Objects>("Chinese", "xxx", "10");
        ScoreScope<? super Number> ss6 = new ScoreScope<Number>("Chinese", "xxx", 10);
    }

    public static <T> T test(T t) {
        return t;
    }

//    static class A implements Test<String> {
//
//        @Override
//        public String test() {
//            return null;
//        }
//    }

//    static class A<T> implements Test<T> {
//
//        @Override
//        public T test() {
//            return null;
//        }
//    }
}