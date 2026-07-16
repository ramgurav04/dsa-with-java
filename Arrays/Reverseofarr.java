public class Reverseofarr {

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 9, 2};

        reverse(arr);

        System.out.println("Reversed Array:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}