class JavaException
{
public static void main(String args[])
{
	int a = 5;
	int b = 0;
	try{
	int result = a/b;
	System.out.println("This will not executed....");
}
catch(ArithmeticException e){
	System.out.println("Number cannot divide by 0");
}
System.out.println("Program ends");
}
}