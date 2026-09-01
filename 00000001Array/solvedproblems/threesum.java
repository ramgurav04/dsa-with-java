import java.util.*;

public class threesum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }

        System.out.println("Triplets are:");
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}