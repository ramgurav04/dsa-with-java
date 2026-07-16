public class Shiftbyone {

    static void shift(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return;
        }

        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 4, 8 };

        shift(arr);

        System.out.println("After shifting by one:");

        for (int m : arr) {
            System.out.print(m + " ");
        }
    }
}