/**
 * 1.6 String Compression: Implement a method to perform basic string
 * compression using the counts of repeated characters. For example, the string
 * a a b c c c c c a a a would become a 2 b l c 5 a 3 , If the
 * 
 * "compressed" string would not become smaller than the original string, your
 * method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z).
 */
public class StringCompression {
    public String compresString(String input) {
        int len = input.length();
        int crntCount = 1;
        char crntChar = input.charAt(0);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == crntChar) {
                crntCount++;
            } else {
                res.append(crntChar);
                res.append(crntCount);
                if (res.length() > input.length()) {
                    return res.toString();
                }
                crntCount = 1;
                crntChar = input.charAt(i);
            }
        }
        res.append(crntChar);
        res.append(crntCount);
        return res.toString();
    }
}
