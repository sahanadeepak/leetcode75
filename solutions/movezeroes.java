package leetcode75.solutions;

public class movezeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = -1; // Pointer for the last non-zero element
        for (int i =0; i < nums.length; i++){
            if( nums[i] != 0){
                lastNonZeroFoundAt++;
                //swap the elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
            }
        }

        }

    public static void main(String[] args) {
        movezeroes obj = new movezeroes();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
