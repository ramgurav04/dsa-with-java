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
        int arr[] = {12, 52, 63, 54, 87, 42}; 
        int k = 1; // Number of steps to rotate
        
        // For left rotation by k steps
        // Step 1: Reverse entire array
        reverse(arr, 0, arr.length - 1);
        
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse remaining elements
        reverse(arr, k, arr.length - 1);
        
        // Print the modified array
        for(int val : arr) { 
            System.out.print(val + " "); 
        }
    } 
}