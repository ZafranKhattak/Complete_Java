public class Demo {

    private String name;
    private int height;
    private int salary;

    void display(Demo student)
    {
       this.name = "Zafran";
       this.height = 8;
        this.salary = 9000;

        System.out.println("Name= " + name + "\n" + "Height= " + height + "\n" + "Salary= "+ salary) ;
    }


    public static void main(String[] args) {
        
        Demo demo = new Demo();
        demo.display(demo);
        Rectangle rect1 = new Rectangle(5, 6);
        Rectangle rect2 = new Rectangle(4, 5);
        boolean result = rect1.isLargerThan(rect2);
        System.out.println(result);
    }
}

class Rectangle
{
    private int width;
    private int height;

    Rectangle(int h , int w)
    {
        this.height = h;
        this.width = w;
    }

    boolean isLargerThan(Rectangle other)
    {
        int thisArea = this.height * this.width ;
        int otherArea = other.height * other.width ;

        return thisArea > otherArea;
    }
}