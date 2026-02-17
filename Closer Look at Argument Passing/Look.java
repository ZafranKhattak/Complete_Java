public class Look {

    int beforeUpdation(int x)
    {
        x = 100;
        System.out.println("Before updation= " + x);
        return x;
    }

    void afterUpdation()
    {
        int num = 45;
        System.out.println("After updation") ;
       num =  beforeUpdation(num);
       System.out.println(num);
    }
     public static void main(String[] args) {
        Look obj = new Look();

        obj.beforeUpdation(7);
        obj.afterUpdation();
    }
}