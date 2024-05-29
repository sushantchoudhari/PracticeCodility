package src;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern wordPattern= new WordPattern();
        String pattern="abba";
        String words="dog cat cat dog";
        // Not Completed
        boolean res=wordPattern.wordPattern(pattern,words);
    }

    private boolean wordPattern(String pattern, String str) {
        String[] words=str.split(" ");
        if (words.length !=pattern.length()) return false;

    //    HashMap<Character, Word > map= new HashMap<Character, Word>();


        return false;
    }
}
