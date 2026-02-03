public class Question5 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int result = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 15) {
                result += arr[i];
            } else {
                break;
            }
        }

        System.out.println(result);

    }
}
