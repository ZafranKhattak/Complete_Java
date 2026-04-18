package Packages;

class Class2 extends Class1 {
    
    public void show()
    {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        // System.out.println("D: " + d);  NOT ALLOWED
    }

    public static void main(String[] args) {
        
        Class2 c2 = new Class2();
        c2.show();
    }
}
