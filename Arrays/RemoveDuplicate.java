public class RemoveDuplicate {
    //Problem 11
    public static void main(String[] args) {
       // int arr[] = {1,1,2,2,2,3,3};
        int arr[] = {1,1,1,2,2,3,3,3,3,4,4};
        int n = arr.length;

         int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
              
                i++;
            
               arr[i] = arr[j];
                  
            }
        }
        for(int k = 0 ;k<=i; k++){
System.out.println(arr[k]);
        }
       
       
    }
}
