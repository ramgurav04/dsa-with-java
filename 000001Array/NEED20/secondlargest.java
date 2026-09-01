class secondlargest{
    static int secondlargest(int arr []){

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                // when new largest comes second largest becomes the previous largest
                secondlargest = largest;
                largest = num;
            }
            else if(num > secondlargest && num != largest){
                secondlargest = num;
            }
        }
        return secondlargest;
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 4, 45, 99};
        System.out.println("Second largest element is: " + secondlargest(arr));
        // Output: Second largest element is: 45
    }
}