class NestedException {
    public static void main(String args[])
    {

        try
        {
            int a = 20;
            int b = a/0;

            try
            {
                int [] arr = {1,2,3,4};
                System.out.println(arr[5]);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally Block Executed");
        }

        System.out.println("After nested Block execution");
    }
}
