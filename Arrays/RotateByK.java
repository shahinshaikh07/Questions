public class RotateByK {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
       // int arr[] ={1,2,3,4,5,6,7};
        //1,2,3,4,5,6,7
        int n = arr.length;
        int k = 2;
        int temp[] = new int[k];  //Temp array to store k elements
        for(int i = 0;i<k;i++)
        {
            temp[i]= arr[i]; //k  elements stored in temp array
        }
        for(int i =0;i<n-k;i++)
        {
            arr[i] = arr[i+k]; //array shifted by k elements
        }
        for(int i=0;i<k;i++)
        {
            arr[i+k+1] = temp[i]; // temp array stored in original array after shifting places.
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}



// //Method 2 
// //rotate element one by one


// /**
//  * RotateByK
//  */
// public class RotateByK {

//     public static void main(String[] args) {

//         int arr[] = {1,2,3,4,5};
//         int n = arr.length;
//         int k = 2;
        
// for(int i = 0; i<n;i++){

// }

//     }
// }