public class recursion7_3_SortedIncre {
    public static void sort(int arr[], int idx) {
        if (idx == arr.length - 1) {
            System.out.println("array is sorted");
            return;
        }
        if (arr[idx + 1] < arr[idx]) {
            System.out.println("array is not sorted");
            return;
        }
        sort(arr, idx + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sort(arr, 0);
    }

}
