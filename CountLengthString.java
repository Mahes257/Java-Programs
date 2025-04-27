public class CountLengthString {
    public static void main(String[] args) {
        String input = "11 helloABC123";
        String[] parts = input.split(" ");
        String str = parts[1];
        
        int letterCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        System.out.println(letterCount); // Output: 8
    }
}
