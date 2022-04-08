/**
 * String Rotation; Assume you have a method isSubs tring which checks if one
 * word is a substring
 * of another. Given two strings, si and s2, write code to check if s2 is a
 * rotation of s1 using only one
 * call to isSubstrin g [e.g., "waterbottle " is a rotation
 * of erbottlewat"),
 */
public class StringRotation {
    public boolean isSub(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len != s2.length() || len == 0) {
            return false;
        } else {
            return isSub(s1 + s1, s2);
        }
    }
}
