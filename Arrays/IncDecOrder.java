import java.util.Arrays;

public class IncDecOrder {
    public static void main(String[] args) {
        
      //  int arr[] = { 8, 7, 1, 6, 5, 9};
        int arr[] = {4, 2, 8, 6, 15, 5, 9, 20, 85};

        int n = arr.length;
        int half = n/2;

       System.out.println(n+" "+half);

        Arrays.sort(arr);

        for(int i =0;i<half;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int j = n-1;j>=half;j--)
        {
            System.out.print(arr[j]+" ");
        }
        
        
    }
}
