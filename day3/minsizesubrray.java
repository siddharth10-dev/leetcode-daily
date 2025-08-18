class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlenwindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int high = 0;
        int low = 0;

        while(high < nums.length){
            currentSum += nums[high];
            high++;
            while(currentSum >= target){
                int currentWindowSize = high - low;
                minlenwindow = Math.min(minlenwindow, currentWindowSize);
                currentSum -= nums[low];
                low++;
            }
        }

        return (minlenwindow == Integer.MAX_VALUE) ? 0 : minlenwindow;
    }
}
