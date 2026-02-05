import java.util.Scanner;

public class Stringg {
    
    public static void main(String[] args) {
        
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name...");
        String name = inp.nextLine();
        System.out.println(name);
        inp.close();

        System.out.println("====== BELOW ARE STRING HANDLING METHOD=======");

        System.out.println("Length of character: "+ name.length());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("UpperCase: " +name.toUpperCase());
        System.out.println("UpperCase: " +name.contains("af"));
        System.out.println("UpperCase: " +name.substring(0 , 5));
        System.out.println("UpperCase: " +name.concat(" Khattak"));
        System.out.println("UpperCase: " +name.equals("zafran khan"));
              
    }
}