import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);  // move start to avoid repeat
            }

            map.put(c, end);  // update last seen position
            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLength);

        scanner.close();
    }
}
