class A{


    void method1()
    {
        System.out.println("A called from method1");
    }
    void method2()
    {
        System.out.println("A called from method2");
    }
}

class B extends A{

    void method1()
    {
        System.out.println("B called from method1");
    }
    void method3()
    {
        System.out.println("B called from method3");
    }
}


class Check
{
    public static void main(String[] args) {
        
        A a;
        B b = new B();

        a = b;

        a.method1();
        a.method2();
        // a.method3();

        A c = new B();
        
        c.method1();
        c.method2();
        
    }
}