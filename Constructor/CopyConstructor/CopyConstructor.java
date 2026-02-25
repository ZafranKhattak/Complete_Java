class CopyConstructor
{
    String name;
    int age;

    CopyConstructor(String name , int age)  // normal constructor
    {
        this.name = name;
        this.age = age;
    }

    CopyConstructor(CopyConstructor c)  // copy constructor
    {
        this.name = c.name;
        this.age = c.age;
    }

    void display()
    {
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }

    public static void main(String[] args) {
        
        CopyConstructor s1 = new CopyConstructor("Nimara Khattak", 19);
        CopyConstructor s2 = new CopyConstructor(s1);

        s1.display();
        s2.display();
    }

}