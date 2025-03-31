package leetcode75.solutions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords {
    public String reverseWordsString(String s){
        String[] wordArray = s.split("\\s+");
        List<String> wordsList = new ArrayList<String>(Arrays.asList(wordArray));
        Collections.reverse(wordsList);
        String reversed = String.join(" ", wordsList);
        return reversed;
    }
    
}
