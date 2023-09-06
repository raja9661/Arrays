import java.util.Arrays;

public class Difference {
    public static int minScore(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int min = nums[0] + k;
        int max = nums[n - 1] - k;
        
        return Math.max(0, max - min);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
