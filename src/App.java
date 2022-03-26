import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // one obj = new one();
        // String q = "I'm nnot kdg";
        // System.out.println("the string: " + q + " isUnique? " + obj.isUnique(q));
        Scanner in = new Scanner(System.in);
        System.out.println("enter string: ");
        String a = in.nextLine();
        // System.out.println("enter 2nd string: ");
        // String b = in.nextLine();
        // Permutation obj = new Permutation();
        // System.out.println("The string: " + a + " and: " + b + " isPermute? " +
        // obj.isPermute(a, b));
        PallindromePermutation obj = new PallindromePermutation();
        System.out.println("THe string: " + a + " is a pallindrome permutation? " + obj.pp(a));
        in.close();
    }
}
