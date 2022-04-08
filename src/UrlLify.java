/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may
 * assume that the string
 * has sufficient space at the end to hold the additional characters, and that
 * you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character
 * array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr 3ohn Smit h 13
 * Output: "Mr%203ohn%20Smith"
 */

public class UrlLify {
    public String url(String input, int trueLen) {
        // char[] chrInp = input.toCharArray();
        // int spaces = 0, ptr = trueLen - 1;
        // count spaces
        // for (int i = 0; i < input.length(); i++) {
        // if (chrInp[i] == ' ') {
        // spaces++;
        // }
        // }
        // for (int i = trueLen - 1; i >= 0; i--) {
        // if (chrInp[i] != ' ' && spaces >= 0) {
        // chrInp[ptr--] = chrInp[i];
        // spaces--;
        // }
        // }
        // return chrInp.toString();

        // by using string builder.
        input = input.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                sb.append("%20");
                continue;
            }
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
