public class BacktrackingArray11 {

    public static void singleSubset(int[] arr, int index, String current) {
        // Base case: if index reaches the length of the array, print the current subset
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        singleSubset(arr, index + 1, current + arr[index] + " ");

        // Exclude the current element
        singleSubset(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        singleSubset(arr, 0, "");
    }
}
