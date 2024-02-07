package JavaStudy.JavaSE.Primary.JavaClass.Demo;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle c1 = new SimpleCircle();
        System.out.println(c1.radius + ": " + c1.getArea());

        SimpleCircle c2 = new SimpleCircle(25);
        System.out.println(c2.radius + ": " + c2.getArea());

        SimpleCircle c3 = new SimpleCircle(125);
        System.out.println(c3.radius + ": " + c3.getArea());

        c2.radius = 100;
        System.out.println(c2.radius + ": " + c2.getArea());
        c2.setRadius(7.0);
        System.out.println(c2.radius);
    }
}

class SimpleCircle {
    double radius;

    // 构造方法(和类同名) 初始化(无参构造)
    SimpleCircle() {
        radius = 1;
    }

    // 构造方法 带参构造
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}