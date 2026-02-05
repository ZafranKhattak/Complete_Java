// it check the logic


import java.util.Scanner;

public class LogicalOperator {
    
    static String name;
    static String nam;

    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);

        System.out.print("Enter your name...");
        name = inp.nextLine();
        System.out.print("Enter your name...");
        nam = inp.nextLine();

        if ((name.equals(nam)) && (name.length() >= 8))
        {
        System.out.print("Same");
        }
        else if ((name.length() < nam.length()) || ( name.length() >=8))
        {
            System.out.println("Kuch b");
        }
        else 
        {
            System.out.print("Not same");
        }
    }
}
