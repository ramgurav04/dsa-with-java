public class FirstMissingPositive {

    public static int findFirstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {

                int targetIdx = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[targetIdx];
                nums[targetIdx] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + findFirstMissingPositive(nums1)); 
    }
}