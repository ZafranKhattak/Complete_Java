public class Question4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                continue;
            }
            evenSum += arr[i];
        }

        System.out.println(evenSum);

    }
}
