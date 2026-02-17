import java.util.Scanner;

public class StringArray {
    
    public static void main(String arg[])
    {
        System.out.println("wihout loop");
        
        String  name[] ={"Zafran" , "Haider" , "Zuhair"};;
    
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        // System.out.println(name[3]);
        System.out.println("======================================================");

        System.out.println("with for loop");

        for (int i=0; i<name.length; i++)
        {
        System.out.println(name[i]);
        }
        System.out.println("======================================================");
        System.out.println("with for each loop");

        for (String names: name)
        {
        System.out.println(names);

        }

        System.out.println("======================================================");
        System.out.println("with while loop");

        int i=0;
        while(i<3)
        {
            System.out.println(name[i]);
            i++;

        }


    }
    
}
