package leetcode75.solutions;

public class isSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        int indexS = 0;
        int indexT = 0;
        if(slength > tlength){
                return false;
            }
            while (indexS < slength && indexT < tlength) {
                if(s.charAt(i) == t.charAt(j)){
                    indexS++;
                }
                indexT++;
            }
            return indexS == slength;
        }
        


public static void main(String[] args) {
    isSubsequenceSolution obj = new isSubsequenceSolution();
    String s = "abc";
    String t = "ahbgdc";
    boolean result = obj.isSubsequence(s, t);
    System.out.println("Is subsequence: " + result);
}
