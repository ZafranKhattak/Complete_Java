class JavaException
{
	public static void main(String args[])

	{
		int a = 12;
		int b = 0;
	try 
	{
		int result = a / b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot divide by 0");
	}

	int arr[] = {1,2};

	try
	{
		System.out.println(arr[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Value not found");
	}
    finally
    {
        System.out.println("This is run always");
    }

}
}