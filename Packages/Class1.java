package Packages;

public class Class1 {
    
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void display()
    {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }

    public static void main(String args[])
    {
        Class1 c1 = new Class1();
        c1.display();
    }
}
