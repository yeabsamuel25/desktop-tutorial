import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Question2 solution = new Question2();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
