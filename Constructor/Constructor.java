// Three types of constructor
//  Default constructor
//  No arguments constructor
//  Paremetized constructor
// constructor is used to iniliatize object

// Defualt Construcotr
class Constructor
{
    String name;
    int age;

    public static void main(String[] args) {
        Constructor inp = new Constructor();
        inp.name = "Zafran Khan";
        inp.age = 20;
        System.out.println("======================  DEFALUT CONSTRUCOTOR=======================");
        System.out.println("Name: " +inp.name + "\n" + "Age: " + inp.age);
        System.out.println();
        ParemetizedConstructor obj = new ParemetizedConstructor("053-21-0035", "0332-xxxxxxxxx");
        System.out.println("======================  PARAMETIZED CONSTRUCOTOR=======================");
        obj.display();
        System.out.println();
        System.out.println("====================== NO PARAMETIZED CONSTRUCOTOR=======================");
        NoParemetizedConstructor no = new NoParemetizedConstructor();

        no.displayInfo();
    }

}


// PAREMETEIZED CONSTRUCOT

class ParemetizedConstructor
{
    String cms;
    String phoneNo;

    ParemetizedConstructor(String cms , String phone)
    {
        this.cms = cms;
        this.phoneNo = phone;
    }

    void display()
    {
        System.out.println("CMS: " + cms + "\n" + "Phone Number: " + phoneNo);
    }
}

// No paremetized constructor

class NoParemetizedConstructor
{
    String houseNo;
    String address;

    NoParemetizedConstructor()
    {
        this.houseNo = "hp-23";
        this.address = "KPK, Pakistan";
    }

    void displayInfo()
    {
        System.out.println("House No: " + houseNo + "\n" + "Address: " + address);
    }
}