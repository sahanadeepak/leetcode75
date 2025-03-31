package leetcode75.solutions;

public class tripletSequence {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for( int num : nums) {
            if (num > middle) {
                return true;
            } else if (num <=  smallest) {
                smallest = num;
            } else {
                middle = num;
            }
            }
        return false;
        
    }
    
}
