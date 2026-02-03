import java.io.*;

public class If {

    public static void main(String ags[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age... ");
        int age = Integer.parseInt(in.readLine());

        // if (age >= 18)
        // {
        //     System.out.print("You are eligible for vote!");
        // }
        // else
        // {
        //     System.out.println("You are not eligible for vote!");
        // }
        System.out.println(age >= 18 ? "You are eligible for vote!" : "You are not eligible for vote!");
    }
}