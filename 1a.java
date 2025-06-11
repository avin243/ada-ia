class BruteForceSearch {
    public static String search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return "key found at index: " + i;
        }
        return "key not found";
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        System.out.println(search(arr, 7)); // Output: 2
        System.out.println(search(arr, 5)); // Output: -1
    }
}