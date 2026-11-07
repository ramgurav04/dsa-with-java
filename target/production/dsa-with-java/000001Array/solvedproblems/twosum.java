public class twosum {
    static  int getsum(int arr []){
        int target = 9;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    int ans[] = {i,j};
                    System.out.println("Target is : 9 & indexes is : " + i + ","+ j);
                }
            }
        }

        return  target;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println(getsum(arr));
    }
}