import java.util.Scanner;

public class SpecificiIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Input index to replace
        System.out.print("Enter the index to replace: ");
        int indexToReplace = scanner.nextInt();

        // Input new character
        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        // Check if the index is within the bounds of the string
        if (indexToReplace >= 0 && indexToReplace < originalString.length()) {
            // Convert the string to a character array
            char[] charArray = originalString.toCharArray();

            // Replace the character at the specified index
            charArray[indexToReplace] = newChar;

            // Convert the character array back to a string
            String modifiedString = new String(charArray);

            // Print the modified string
            System.out.println("Original String: " + originalString);
            System.out.println("Modified String: " + modifiedString);
        } else {
            System.out.println("Index out of bounds.");
        }

        scanner.close();
    }
}
