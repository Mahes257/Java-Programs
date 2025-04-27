import java.util.Scanner;

public class OnlyCharsWithECheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check for 'E' or 'e'
        if (!input.toLowerCase().contains("e")) {
            System.out.println("No 'E' found in the input.");
            return;
        }

        // Split input into words
        String[] words = input.trim().split("\\s+");

        // Loop through each word
        for (String word : words) {
            StringBuilder onlyChars = new StringBuilder();

            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    onlyChars.append(ch);
                }
            }

            // Print only if something remains after removing digits
            if (onlyChars.length() > 0) {
                System.out.println(onlyChars.toString());
            }
        }

        scanner.close();
    }
}
