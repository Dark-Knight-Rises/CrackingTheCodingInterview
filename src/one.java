import java.util.Hashtable;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you
 * cannot use additional data structures?
 */
public class one {
    boolean isUnique(String word) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        char[] w = word.toCharArray();
        for (int i = 0; i < w.length; i++) {
            if (ht.containsKey(w[i])) {
                return false;
            }
            if (w[i] != ' ') {
                ht.put(w[i], i);
            }
        }
        return true;
    }
}
