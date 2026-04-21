class Test {
    public static void main(String[] args) {
        try {
            System.out.print("A ");
            try {
                System.out.print("B ");
                String str = null;
                System.out.print(str.length());
                System.out.print("C ");
            } catch (ArithmeticException e) {
                System.out.print("D ");
            } finally {
                System.out.print("E ");
            }
            System.out.print("F ");
        } catch (NullPointerException e) {
            System.out.print("G ");
        } finally {
            System.out.print("H ");
        }
        System.out.print("I");
    }
}