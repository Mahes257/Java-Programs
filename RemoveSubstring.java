public class RemoveSubstring {
    public static void main(String[] args) {
        String S1 = "abbcdbcca";
        String S2 = "bc";

        String result = removeFirstOccurrence(S1, S2);
        System.out.println("Output: " + result);
    }

    public static String removeFirstOccurrence(String mainStr, String toRemove) {
        int index = mainStr.indexOf(toRemove);

        if (index == -1) {
            return mainStr; // S2 not found in S1
        }

        return mainStr.substring(0, index) + mainStr.substring(index + toRemove.length());
    }
}
