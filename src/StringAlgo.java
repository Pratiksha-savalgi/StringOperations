import java.util.HashMap;
import java.util.HashSet;

//palindrome check
//First Non-Repeating Character
//Longest Palindromic Substring
//Remove Duplicate Characters
//String Rotation Check
public class StringAlgo {

    public boolean palindromeCheck(String s) {
        int l = 0;
        int r = (s.length()) - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public char nonRepeatingCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }

        }
        return '\0';
    }

    public String palindromeSubstring(String s) {
        if (s == null || s.length() < 2) return s;
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }

        }
        return s.substring(start, start + maxLen);
    }

    private int expand(String sb, int left, int right) {
        while (left >= 0 && right < sb.length() && sb.charAt(left) == sb.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String removeDuplicate(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (set.add(ch)) {
                ;
                result.append(ch);
            }

        }
        return result.toString();
    }
    public boolean stringRotation(String s1,String s2){
        if(s1==null || s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        String s=s1+s1;
        return s.contains(s2);
    }

}
