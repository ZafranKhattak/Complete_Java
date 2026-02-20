public class NonStaticDemo {
    
    void greet() {
        System.out.println("Hello World!");
    }

    void name() {
        System.out.println("Zafran Khan");

    }

    public static void main(String[] args) {

        NonStaticDemo obj = new NonStaticDemo();
       obj.greet();
        obj.name();
    }
}
