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
        System.out.println("enter 2nd string: ");
        String b = in.nextLine();
        // Permutation obj = new Permutation();
        // System.out.println("The string: " + a + " and: " + b + " isPermute? " +
        // obj.isPermute(a, b));
        // PallindromePermutation obj = new PallindromePermutation();
        // System.out.println("THe string: " + a + " is a pallindrome permutation? " +
        // obj.pp(a));
        // OneAway obj = new OneAway();
        // System.out.println("The strings: " + a + " and : " + b + " are oneAway? " +
        // obj.oneAway(a, b));
        // StringCompression obj = new StringCompression();
        // System.out.println("The string " + a + " 's compressed version is: " +
        // obj.compresString(a));
        // UrlLify obj = new UrlLify();
        // System.out.println("Input: " + a);
        // System.out.println("output: " + obj.url(a, a.length()));
        StringRotation obj = new StringRotation();
        System.out.println(obj.isRotation(a, b));
        in.close();
    }
}
