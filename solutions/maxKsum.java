package leetcode75.solutions;

public class maxKsum {
    public int maxOperations(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
       while(left < right){
        sum = nums[left] + nums[right];
            if(sum == k){
                result++;
                left++;
                right--;
            }
            else if(sum < k){
                left++;
            }
            else{
                right--;
            }
           

       }
        return result;
    }
    public static void main(String[] args){
        maxKsum obj = new maxKsum();
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int result = obj.maxOperations(nums, k);
        System.out.println("Max operations: " + result);
    
}
}