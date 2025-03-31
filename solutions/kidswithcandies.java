package leetcode75.solutions;
//Kids with the Greatest Number of Candies
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]

import java.util.ArrayList;
import java.util.List;

class kidswithcandiesSolution {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int i = 0; i< candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i< candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
        
    }
}
