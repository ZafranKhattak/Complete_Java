import java.io.*;

public class Switch {

    public static void main(String ags[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your marks... ");
        int marks = Integer.parseInt(in.readLine());

        switch (marks) {
            case 90:
                System.out.print("A grade");
                break;
            case 80 :
                System.out.print("B grade");
            case 70 :
                System.out.print("C grade");
                break;
            default:
                System.out.print("Fail");
                break;
        }

    }
}