public class Average {

    static double Getaverage(int[] arr){
        double sum = 0;

        for (int i:arr){
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    public static void main (String args []){
        int arr [] = {4,5,7,8,9,2};
        System.out.println(Getaverage(arr));
    }
}