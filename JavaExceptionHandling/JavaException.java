class JavaException {
    public static void main(String args[]) {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("This will not executed....");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide number by 0");
        } finally {
            System.out.println("This will always execute even if there is Exception handling in the code ");
        }
        System.out.println("Program ends");

    }
}