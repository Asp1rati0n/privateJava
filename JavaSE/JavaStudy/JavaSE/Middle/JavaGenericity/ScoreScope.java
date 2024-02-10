package JavaSE.JavaStudy.JavaSE.Middle.JavaGenericity;

// extends 设置泛型上界 (类和方法只能设置上界, 不能设置下界)
public class ScoreScope<T extends Number> {
    String name;
    String id;
    T value;

    public ScoreScope(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
