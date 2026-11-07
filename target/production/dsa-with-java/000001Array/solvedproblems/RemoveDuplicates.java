 public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(j < n){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i + 1;
    }
    
    public static void main(String[] args) {
        
        int[] arr1 = {1, 1, 2};
        int k1 = removeDuplicates(arr1);
        System.out.println("Length: " + k1);
        System.out.print("Array: ");
        for(int x = 0; x < k1; x++) {
            System.out.print(arr1[x] + " ");
        }
        System.out.println();
        
    }
}