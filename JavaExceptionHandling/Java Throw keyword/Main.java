import java.util.*;

class JavaException {
    static void checkAge(int age) throws  ArithmeticException
{
	if(age < 18)
	// throw new ArithmeticException("Access Denied.....");
System.out.println("Access Denied");
else
{
System.out.println("Access Granted");
}
}
}

class Main
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter your Age: ");
int age = sc.nextInt();

JavaException.checkAge(age);
sc.close();
}
}