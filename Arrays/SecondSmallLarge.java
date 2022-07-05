import java.util.*;

/**
 * SecondSmallLarge
 */
public class SecondSmallLarge {

    public static void main(String[] args) {

        int arr[] = {5};
        int n = arr.length;

        Arrays.sort(arr);

         System.out.println("Length of Array : "+n);
        for(int i = 0;i<n;)   // second smallest number
        {
//System.out.print(arr[i]+" ");

if(arr[i] == arr[i + 1])
{
    i++;
}
else{
    System.out.println("Second Smallest : " + arr[i+1]);
    break;
}
        }

        for(int i=5; i>=0;)   //i=n-1
        {
            if(arr[i] == arr[i-1])
            {
                i--;
            }
            else{
               System.out.println("Second Largest : "+ arr[i-1]);
                break;
            }
        }
        


        
    }

}