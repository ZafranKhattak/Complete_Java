/*
This Keyword (Basic)
What is the 'this' keyword? 
A reference to the current object.
It's used to distinguish between instance variables and parameters with the same name.
*/

public class Student {
    private String name;
    
    public void setName(String name) {
        this.name = name;  // 'this.name' refers to instance variable
    }
    
    public String getName() {
        return this.name;  // Optional but clear
    }

    public static void main(String[] args) {
        
        Student display = new Student();
        display.setName("Zafran Khan");
        System.out.println(display.getName());
    }
}