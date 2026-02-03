public class JavaConstructor {
    
    int age;
    String name;
  public  JavaClass()
    {
        age = 20;
        name = "Zafran Khan";
    }
    public static void main(String[] args) {
        
        JavaClass obj = new JavaClass();

        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}

