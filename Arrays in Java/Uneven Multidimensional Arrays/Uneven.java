/*
Uneven Multidimensional Arrays
What are Uneven Multidimensional Arrays? 
Multi-dimensional arrays where each row can have a different number of columns.
*/

public class Uneven {

    public static void main(String[] args) {

        int[][] uneven = new int[3][];
        uneven[0] = new int[2]; // First row has 2 columns
        uneven[1] = new int[4]; // Second row has 4 columns
        uneven[2] = new int[3]; // Third row has 3 columns

        // Or initialize directly
        int[][] jagged = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };


        for (int i=0; i<jagged.length; i++)
        {
            for (int j=0; j<jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
        }
    }
}
