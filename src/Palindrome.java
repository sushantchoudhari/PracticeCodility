package src;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       boolean res= validPalindrome(s);
        System.out.println(" res "+ res);
    }

    private static boolean validPalindrome(String s) {
        String fixedString="";
        for (char c: s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }
        fixedString = fixedString.toLowerCase();
        System.out.println(" " + fixedString);
        int a_pointer=0;
        int b_pointer=fixedString.length()-1;
        while (fixedString.charAt(a_pointer) != fixedString.charAt(b_pointer )) {
            return false;
        }
        a_pointer +=1;
        b_pointer -=1;

        return true;
    }
}
