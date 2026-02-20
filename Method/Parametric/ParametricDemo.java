class ParametricDemo {

    static String name(String nam) {
        return nam;
    }

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("my name is " + name("Zafran Khan"));
        ParametricDemo obj = new ParametricDemo();
        System.out.println("The sum of two numbers is " + obj.sum(4, 7));
    }
}
