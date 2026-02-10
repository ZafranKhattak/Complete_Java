public class ConstructorOverloadingDemo {
        
    String name;
    int age;
    double height;

    ConstructorOverloadingDemo(String n , int a , double h)
    {
        this.name = n;
        this.age = a;
        this.height = h;
    }
    ConstructorOverloadingDemo()
    {
        this.name = "Unknown";
        this.age = 0;
        this.height = 0.0;
    }

    void display()
    {
        System.out.print("name= "+ name + " age= " + age + " heigth= " + height);
    }
    public static void main(String[] args) {
        ConstructorOverloadingDemo demo = new ConstructorOverloadingDemo("Zafran Khan" , 20 , 5.7);
        ConstructorOverloadingDemo demo2 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo demo3 = demo;

        demo2.display();
        demo.display();
        demo3.display();
        demo = null;
        demo2.display();

        demo3.display();
    }

}
