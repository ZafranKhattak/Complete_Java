class OverloadingDemo
{
    int sum(int a , int b)
    {
        return a+b;
    }

    int sum(int a , int b , int c)
    {
        return a+b + c;
    }
    
    double sum(double a , double b)
    {
        return a+b;
    }
/*
    void confusionCompilor(double a , int b)
    {
        System.out.println("double , int");
    }

    void confusionCompilor(int a , double b)
    {
        System.out.println("int , double");
    }
 */
    void displayValues()
    {
        System.out.println("The sum of first sum is = " + sum(5,6));
        System.out.println("The sum of 2nd sum is = " + sum(5,6 , 6));
        System.out.println("The sum of double sum is = " + sum(5.7,6.6));
    }

    public static void main(String[] args) {
        
        OverloadingDemo demo = new OverloadingDemo();
        demo.displayValues();
        // demo.confusionCompilor(3,5);  this is give compiler ambigous
    }
}