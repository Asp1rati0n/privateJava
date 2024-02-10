package JavaSE.JavaStudy.JavaSE.Middle.JavaGenericity;

// 泛型
public class Score<U, T> {
    String name;
    // String id;
    U id;
    // Object 是所有类型的父类
    // Object value;
    // 泛型变量 (T 会根据使用时提供的类型自动变成对应类型)
    T value;

//    public Score(String name, String id, Object value) {
//        this.name = name;
//        this.id = id;
//        this.value = value;
//    }

    // 这里 T 可以是任何类型, 但是一旦确定就不能修改
    public Score(String name, U id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
        // 类型不确定(不能构造待定类型)
        // new T();
    }

//    public Object getValue() {
//        return value;
//    }

    public T getValue() {
        return value;
    }
}
