import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to lowercase to handle both uppercase and lowercase characters
        inputString = inputString.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the counts of vowels and consonants
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}
