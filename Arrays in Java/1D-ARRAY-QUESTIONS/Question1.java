public class Question1 {

    public static void main(String arg[]) {
        int[] arr = { 5, 10, 15, 20 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

    }
}
