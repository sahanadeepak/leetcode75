package leetcode75.solutions;

public class canPlaceFlowersSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int length = flowerbed.length;

        for(int i =0 ; i<length; i++){
            int left = (i == 0) ? 0 : flowerbed[i-1];
            int right = (i == length -1) ? 0 : flowerbed[i+1];
            if(left == 0 && right == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

}
