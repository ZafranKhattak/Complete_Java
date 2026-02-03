import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The first index of array is... " + arr[0]); // first index
        System.out.println("The length of array is... " + arr.length); // length of array

        // loop on array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // taking input from user

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter size of array....");
        int sizeOfArray = inp.nextInt();

        int array[] = new int[sizeOfArray];

        System.out.println("Enter Elements of array....");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            array[i] = inp.nextInt();

        }
        System.out.println("Elements of array are....");
        // DISPLAY ELEMENT OF ARRAY
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println(array[i]);
        }

        inp.close();
    }
}