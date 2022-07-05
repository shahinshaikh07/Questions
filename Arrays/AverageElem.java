public class AverageElem {
    //Problem 9
    public static void main(String[] args) {
        // int arr[] =  {1, 2, 3, 4, 5};
        int arr[] = {1,2,1,1,5,1};
        int n = arr.length;
        double sum = 0 ;
        for(int i = 0; i< n ; i++){
            sum = sum + (double) arr[i];
        }
    double avg = sum / n;
        System.out.println(avg);
    }
}
