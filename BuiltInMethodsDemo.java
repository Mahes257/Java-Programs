import java.util.*;

public class BuiltInMethodsDemo {
    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // String methods
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring (0 to 3): " + input.substring(0, Math.min(3, input.length())));
        System.out.println("Contains 'a': " + input.contains("a"));
        System.out.println("Replaced 'a' with '@': " + input.replace('a', '@'));

        // Math methods
        double num = 25.75;
        System.out.println("Round: " + Math.round(num));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Square root: " + Math.sqrt(num));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));

        // Array methods
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers); // Sorting
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Binary search for 3: " + Arrays.binarySearch(numbers, 3));

        // Collections methods (ArrayList)
        List<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        Collections.sort(list); // Sort list
        System.out.println("Sorted list: " + list);
        Collections.reverse(list); // Reverse list
        System.out.println("Reversed list: " + list);
        Collections.shuffle(list); // Shuffle list
        System.out.println("Shuffled list: " + list);
        System.out.println("Max element: " + Collections.max(list));

        // Date and Time
        Date date = new Date();
        System.out.println("Current date: " + date.toString());

        scanner.close(); // Close scanner
    }
}
