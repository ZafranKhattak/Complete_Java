// Relational operators are used to compare values and return true or false

import java.util.Scanner;

public class Relational_Operator {
    
    static int num1;
    static int num2;

    public static void main(String arg[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Etner first num...");
        num1 = inp.nextInt();
        System.out.print("Enter second num...");
        num2 = inp.nextInt();

        if (num1 == num2)
        {
            System.out.println("Both are same!");
        }
        else if (num1 > num2) 
        {
            System.out.println("Num 1 is greator!");
        }
        else
        {
            System.out.println("num 2 is greator");
        }
        inp.close();
    }
}
