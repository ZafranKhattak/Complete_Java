package Packages.Nested;

import Packages.Class1;

public class Class3 extends Class1 {
    
    public void showValues()
    {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        // System.out.println("C: " + c);  NOT ALLOWED
    }

    public static void main(String[] args) {
        Class3 c3 = new Class3();
        c3.showValues();
    }
}