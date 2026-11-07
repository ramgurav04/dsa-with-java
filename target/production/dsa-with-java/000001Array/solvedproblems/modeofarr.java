import java.util.HashMap;

public class modeofarr {
   
    static int mode(int arr []){
        HashMap <Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        int mode = arr[0];
        for(int key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                mode = key;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,4, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Mode of the array is: " + mode(arr));
    }
}