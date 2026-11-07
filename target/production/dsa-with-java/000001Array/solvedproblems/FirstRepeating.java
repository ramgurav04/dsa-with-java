import java.util.*;

public class FirstRepeating {
    public static int findFirstRepeating(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Find first element with frequency > 1
        for (int num : arr) {
            if (freq.get(num) > 1) {
                return num;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 2, 6};
        
        System.out.println("Array: " + Arrays.toString(arr));
        
        int result = findFirstRepeating(arr);
        
        if (result == -1) {
            System.out.println("No repeating element found");
        } else {
            System.out.println("First repeating element: " + result);
        }
    }
}