public class Question2 {
    public static void main(String arg[]) {

        int[] nums = { 3, 6, 9, 12 };
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}