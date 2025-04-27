import java.util.Scanner;

public class DuplicateInString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder stack = new StringBuilder();
        for (char c : input.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); // Remove duplicate
            } else {
                stack.append(c); // Add to result
            }
        }
        System.out.println("Result after removing adjacent duplicates: " + stack.toString());
        scanner.close();
    }
}

