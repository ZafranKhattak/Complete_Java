/*
f/Else and Array
Requirements: Create an array of 5 integers, input array elements and perform following tasks:

Find and print the largest number
Input a number to search and print whether the number is found or not
Count how many even numbers are in it
Print elements in reverse order
*/

import java.util.Scanner;

class Demo {
    public static void main(String arg[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter size of array...");
        int size = inp.nextInt();

        int[] array = new int[size];

        int largest = array[0];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Element..");

            array[i] = inp.nextInt();
        }

        System.out.println("Enter your target...");

        int target = inp.nextInt();

        int count = 0;
        boolean found = false;

        System.out.print("You entered ... ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] > 0) {
                count++;
            }

            if (array[i] == target) {
                found = true;
            }

        }


        if (!found) {
            System.out.println("\nTarget not found");
        } else {
            System.out.println("\nTarget found");
        }
        System.out.println("The largest integer is..." + largest);
        System.out.println("Even numbers are..." + count);

        System.out.println("In reverse order...");

        for (int i=size-1; i>=1; i--)
        {
            System.out.print(array[i] + " ");
        }

        inp.close();
    }
}