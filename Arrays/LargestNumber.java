import java.util.*;

/**
 * LargestNumber
 */
public class LargestNumber {

    public static void main(String[] args) {
        int arr1[] = {15, 4, 0};
        int arr2[] = {35, 78, 9, 3};
        int len = arr1.length;
        // int c = large(arr1, len);
        System.out.println("Largest Number in the Array :" + large(arr1, len));
         System.out.println("Largest Number in the Array :" + large(arr2, len));
        
    }

    static int large(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];

    }

}