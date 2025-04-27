import java.util.Scanner;

public class DigitsFirstLineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigitPart = new StringBuilder();

        // Separate digits and non-digit characters
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                nonDigitPart.append(ch);
            }
        }

        // Print digits first
        System.out.println(digits.toString());

        // Split remaining string by whitespace and print each word on new line
        String[] words = nonDigitPart.toString().trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
