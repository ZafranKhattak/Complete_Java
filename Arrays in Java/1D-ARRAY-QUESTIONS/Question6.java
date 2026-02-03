public class Question6 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == 6) {
                i++;
                continue;
            }
            System.out.print(arr[i] + " ");
            i++;
        }

    }
}
