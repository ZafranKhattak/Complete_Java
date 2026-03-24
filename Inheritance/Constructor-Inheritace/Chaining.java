class A 
{
    int val = 100;
    A()
    {
        System.out.println("I am constructor of A");
    }
}

class B extends A
{
    void dis()
    {
        System.out.println("the val is : " + val);
    }
    B()
    {
        System.out.println("I am constructor of B");
    }
}

class C extends B 
{
    C()
    {
        System.out.println("I am constructor of C");
    }
}

class Chaining 
{
    public static void main(String[] args) {
        
        C c = new C();  // A B C
        A a = new A();  // A
        B b = new C(); // A B C 
    }
}