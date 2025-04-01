import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        boolean result = areAnagrams(str1, str2);
        
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
        
        scanner.close();
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check length
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Convert to char array and sort
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
