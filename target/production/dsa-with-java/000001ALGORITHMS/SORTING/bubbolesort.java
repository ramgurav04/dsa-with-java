
import java.util.Arrays;

public class bubbolesort {

    public static int[] bsort(int arr[]) {
        int size = arr.length;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};

        System.out.println(Arrays.toString(bsort(arr)));
    }
}
