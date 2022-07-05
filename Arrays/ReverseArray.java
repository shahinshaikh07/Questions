public class ReverseArray {

 public static void main(String[] args) {
    
        int arr[] = { 5,4,3,2,1};
        int n = arr.length;

        System.out.println("Length of Array :" +n);

       for(int i = n-1; i>=0; i--)
       {
           System.out.print(arr[i]+" ");
       }
 
    
 }
}
