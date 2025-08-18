import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Mark indices as negative for numbers we see
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // map number to index
            if (nums[index] > 0) { // mark only once
                nums[index] = -nums[index];
            }
        }
        
        // Step 2: Numbers corresponding to positive indices are missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // index + 1 is missing
            }
        }
        
        return result;
    }
}
