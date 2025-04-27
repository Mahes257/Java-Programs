import java.util.Scanner;

public class VowelExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String vowels = extractVowels(input);
        System.out.println("Vowels in the word: " + vowels);
    }

    public static String extractVowels(String word) {
        StringBuilder result = new StringBuilder();
        String lowerCaseWord = word.toLowerCase();

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char ch = lowerCaseWord.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

