package leetcode75.solutions;

public class containerwater {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int maxArea = 0;
       while(left < right){
        int currentArea = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, currentArea);
        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
       }
        return maxArea;

    }
    public static void main(String[] args) {
        containerwater obj = new containerwater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = obj.maxArea(height);
        System.out.println("Max area: " + result);
    }
    
}
