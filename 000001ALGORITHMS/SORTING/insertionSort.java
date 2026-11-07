import java.util.Arrays;

public class insertionSort {

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break; 
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 3};
        new insertionSort().insertionSort(arr);
    }
}