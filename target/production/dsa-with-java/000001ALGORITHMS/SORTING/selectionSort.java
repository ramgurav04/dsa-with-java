class selectionSort{
    static void selectionSort(int arr[]){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        selectionSort(arr);
        System.out.println("\nAfter Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}