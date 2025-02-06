class StaticDemo {
    static int a = 42;
    static int b = 32;

    static void find() {
        System.out.println("b = " + b);
    }
}

public class StaticByName {
    public static void main(String[] args) {
        System.out.println("a = " + StaticDemo.a);
        StaticDemo.find();

    }
}
