class unsortedelementinarr{
    static int getele(int arr []){
        int ele = 0;
        for(int i=0;i <arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                ele = arr[i+1];
            }
        }
        return ele;
    }
    static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        System.out.println(getele(arr));
    }
}