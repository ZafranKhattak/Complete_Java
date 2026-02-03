public class Question3 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        int x = 5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
