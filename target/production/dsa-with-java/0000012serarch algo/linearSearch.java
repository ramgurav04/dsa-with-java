public class linearSearch{
    public  static int linearSearch(int tar , int arr[]){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == tar){
                ans = i;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int tar = 5;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(tar,arr));
    }
}