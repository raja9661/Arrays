import java.util.HashMap;
public class LongestContiguousSubarray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1); // Initialize with (0, -1)
        
        int maxLen = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {

            count += (nums[i] == 1 ? 1 : -1);
            if (sumMap.containsKey(count)) {
                int len = i - sumMap.get(count);
                maxLen = Math.max(maxLen, len);
            } else {
                sumMap.put(count, i);
            }
        }
        
        return maxLen;
    }

    public static void main(String args[])
    {
        int nums[]={0,1};
        int maxLength =findMaxLength(nums);
        System.out.println(maxLength);
    }
}
