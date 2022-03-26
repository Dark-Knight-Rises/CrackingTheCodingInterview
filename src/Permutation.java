
// import java.util.HashMap;
import java.util.Hashtable;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a
 * permutation of the
 * other.
 */
public class Permutation {
    public boolean isPermute(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aChr = a.toCharArray();
        char[] bChr = b.toCharArray();
        Hashtable<Character, Integer> htA = new Hashtable<>();
        Hashtable<Character, Integer> htB = new Hashtable<>();
        for (int i = 0; i < aChr.length; i++) {
            htA.put(aChr[i], htA.getOrDefault(aChr[i], 0) + 1);
            htB.put(bChr[i], htB.getOrDefault(bChr[i], 0) + 1);
        }
        System.out.println("a: " + htA + " b: " + htB);
        return htA.equals(htB);
    }
}
