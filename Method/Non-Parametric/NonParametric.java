
public class NonParametric {
    static void greet() {
        System.out.println("Hello World!");
    }

    static void name() {
        System.out.println("Zafran Khan");

    }

    void hello() {
        System.out.println("Hello World!");
    }

    void first() {
        System.out.println("Zafran Khan");

    }

    public static void main(String[] args) {
        greet();
        name();

        NonParametric obj = new NonParametric();
        obj.hello();
        obj.first();
    }
}
