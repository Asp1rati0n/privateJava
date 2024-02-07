package JavaStudy.JavaSE.Primary.JavaEnumClass;

public enum Status {
    // ; 可省略
    RUNNING("running"), STUDY("study"), SLEEP("sleep");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
