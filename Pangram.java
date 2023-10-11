import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram: ");
        String input = scanner.nextLine();
        scanner.close();
        
        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean checkIfPangram(String input) {
        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];
        
        // Convert the input string to lowercase to make the comparison case-insensitive
        input = input.toLowerCase();
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is an English alphabet (a to z)
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding alphabet as present
                alphabetPresent[ch - 'a'] = true;
            }
        }
        
        // Check if all alphabets are marked as present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }
}
