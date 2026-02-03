/*
STATIC
Static is a keyword 
it can access without making object
*/

/*
NON STATIC
for this we have to create object
*/

public class Static_Non_Static
{

    static String name = "Zafran Khan";
    int age = 67;

    public static void main(String[] args) {
        System.out.println("My name is "+name);
        Static_Non_Static obj = new Static_Non_Static();
        System.out.println("My age is " +obj.age);
        
    }
}