package leetcode75.solutions;

public class gcd {
    
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 +str1)){
            return "";
        }
        int gcdString = gcdValue(str1.length(), str2.length());
        String result = str1.substring(0, gcdString);
        return result;
    } 
    public int gcdValue(int a, int b){
        return b == 0 ? a : gcdValue(b, a%b);
    }


}