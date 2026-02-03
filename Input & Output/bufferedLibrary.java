import java.io.*;

public class bufferedLibrary {

    public static void main(String ags[]) throws IOException
    {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name.. ");
        String name = inp.readLine();
        System.out.println("My name is "+name);

        System.out.print("Enter your age... ");
        int age = Integer.parseInt(inp.readLine());
        System.out.println("My age is "+age);
    }
}