/*
Private Attributes
Class attributes marked with private keyword 
that can only be accessed within the same class,
not from outside.
*/

class PrivateMethod {
    private int age = 19;
    private int salary = 450000;

    public void Display() {

        System.out.println("Age= " + age);
        System.out.println("Salary= " + salary);
    }

    public static void main(String arg[]) {
        PrivateMethod disp = new PrivateMethod();
        disp.Display();

        PrivateMe disp1 = new PrivateMe();
        disp1.setName("Zafran Khan");
        disp1.setEdu("Software Engineer");
        System.out.println(disp1.getName());
        System.out.println(disp1.getEdu());

    }

}

class PrivateMe {
    private String name;
    private String edu;

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getEdu() {
        return edu;
    }
}
