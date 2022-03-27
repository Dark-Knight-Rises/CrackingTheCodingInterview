
/**
 * One Away: There are three types of edits that can be performed on strings:
 * insert a character,
 * remove a character, or replace a character. Given two strings, write a
 * function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale , ple - > true
 * pales , pale - > true
 * pale , bale - > true
 * pale , bake - > false
 */

public class OneAway {
    public boolean oneAway(String a, String b) {
        int diff = Math.abs(a.length() - b.length());
        if (diff > 1) {
            return false;
        }
        boolean flag = false;
        String s1 = a.length() > b.length() ? a : b; // bigger string
        String s2 = a.length() > b.length() ? b : a; // smaller string
        int index1 = 0, index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                // ensure first time
                if (flag) {
                    return false;
                }
                flag = true;
                if (s1.length() == s2.length()) {
                    // on replace move shorter pointer
                    index2++;
                }
            } else {
                // if characters match move shorter pointer
                index2++;
            }
            // always move longer pointer
            index1++;
        }
        return true;
    }
}
