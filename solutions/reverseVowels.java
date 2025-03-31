package leetcode75.solutions;

public class reverseVowels {
    public String reverseVowelsOfString(String s){
        boolean isVowel[] = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray()){
            isVowel[c] = true;
        }
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            while(left < right && !isVowel[arr[left]]){
                left++;
            }
            while(left < right && !isVowel[arr[right]]){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);

    }
    
}
