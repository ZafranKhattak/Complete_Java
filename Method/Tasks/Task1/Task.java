// Checking result

import java.util.Scanner;

public class Task {
    
    static String resultChecking(int marks)
    {
        if (marks >=75)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your marks..");

        int marks = inp.nextInt();
        
        System.out.println(resultChecking(marks));
    }
}
