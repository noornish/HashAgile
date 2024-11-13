import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = s.nextLine();
        System.out.println(firstUnique(input));
        s.close();
    }

    public static char firstUnique(String s) {
        // Loop through string
        for (int i = 0; i < s.length(); i++) {
            // Count occurrences of character
            int count = 0;
            // Check if the current character repeats in the string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            // If count is 1, return the current character
            if (count == 1) {
                return s.charAt(i);
            }
        }
        // If no unique character is found
        return '0';
    }
}
