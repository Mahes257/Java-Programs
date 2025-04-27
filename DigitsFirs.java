import java.util.Scanner;

public class DigitsFirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();  // To collect digits
        StringBuilder others = new StringBuilder();  // To collect non-digits

        // Loop through each character
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);  // Add digit to digits
            } else {
                others.append(ch);  // Add other characters
            }
        }

        // Print digits first, then the rest
        System.out.println("Output: " + digits.toString() + others.toString());

        scanner.close();
    }
}