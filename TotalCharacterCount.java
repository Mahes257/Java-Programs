import java.util.Scanner;

public class TotalCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int totalCount = str.length();

        System.out.println("Total number of characters: " + totalCount);

        scanner.close();
    }
}