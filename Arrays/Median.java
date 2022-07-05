import java.util.Arrays;
public class Median { //Problem 10
    public static void main(String[] args) {
        int arr[] = {2,5,1,7};
        // int[] arr = {4, 7, 1, 2, 5, 6};
        int n = arr.length;
        Arrays.sort(arr);
        //  double median;
        if(n % 2 == 0){
            int i1 = (n/2) - 1;
            int i2 = (n/2);
            System.out.println((double) (arr[i1] + arr[i2]) / 2);
// median = ( double) i1 + i2 / 2;
        }
        else{
          System.out.print(arr[(n / 2)]);
        }
       
        // System.out.println(median);
    }
}
