public class Rotatebykstep {
    public static void reverse(int arr[], int st, int end){ 
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,52,63,54,87,42};

        // Pass the start index (0) and last index (arr.length - 1)
        reverse(arr, 0, arr.length - 1);

        // Print the modified array
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}