import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class OriginalArray {
    public static int[] findOriginalArray(int[] changed) {
        // Check if the length of the changed array is odd
        if (changed.length % 2 != 0) {
            return new int[0]; // Return an empty array
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                originalList.add(num);
                countMap.put(num, countMap.get(num) - 1);
                int doubleNum = 2 * num;
                if (countMap.containsKey(doubleNum) && countMap.get(doubleNum) > 0) {
                    countMap.put(doubleNum, countMap.get(doubleNum) - 1);
                } else {
                    return new int[0]; // Return an empty array
                }
            }
        }
        
        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }
        
        return original;
    }
    public static void main(String args[])
    {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original =findOriginalArray(changed);
        for (int num : original)
        {
         System.out.print(num + " ");
        }
    }
    
}
