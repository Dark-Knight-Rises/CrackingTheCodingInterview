import java.util.Hashtable;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to
 * just dictionary words.
 * EXAMPLE
 * Input: Tac t Coa
 * Output: Tru e (permutations : "tac o cat" , "atc o eta" , etc. )
 * 
 * approach ->
 * USE hashtable and check if every element has even occourences
 * with only one element allowed to occour one time.
 * if exists return true.
 */
public class PallindromePermutation {
    public boolean pp(String input) {
        char[] inp = input.toCharArray();
        Hashtable<Character, Integer> ht = new Hashtable<>();
        int len = inp.length;
        boolean foundOdd = false;
        for (int i = 0; i < len; i++) {
            if (inp[i] != ' ') {
                ht.put(inp[i], ht.getOrDefault(inp[i], 0) + 1);
            }
        }
        // check if every element has even occurences.
        for (char c : ht.keySet()) {
            if (ht.get(c) % 2 == 1) {
                if (ht.get(c) == 1 && !foundOdd) {
                    foundOdd = true;
                } else {
                    return false;
                }
            }

        }

        System.out.println(ht);
        return true;
    }
}
