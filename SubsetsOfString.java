public class SubsetsOfString {

    public static void generateSubsets(String str, int index, String current) {
        // Base case: if index reaches end of string
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character
        generateSubsets(str, index + 1, current + str.charAt(index));

        // Exclude the current character
        generateSubsets(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        generateSubsets(str, 0, "");
    }
}

