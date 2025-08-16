public class contianerwmostwater {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right){
            int current_area = Math.min(height[left], height[right]) * (right -left);
            max_area = Math.max(max_area, current_area);
            if(height[left]<height[right]){
                left++;
                }
            else{
            right--;
            }
        }
        return max_area;
    }
}
