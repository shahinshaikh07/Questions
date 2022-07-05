public class AddElement {
    //Problem  No 13

    public static void main(String[] args) {
        int arr[] = {2, 3, 4}; 
       // int n = arr.length; //3
        int value = 1;
        //Insertion at begining;
      // int temp = arr[2];
        // for(int i = 0; i<=2;i++)
        // {
            arr[2] = arr[1];
            arr[1] = arr[0];
        // }
        arr[0] = value;
     //  arr[3] = temp;

        for(int i = 0; i<3;i++){
            System.out.println(arr[i]);
        }

// int k = 1;

// for(int i=2-1;i>=0;i--)
//     {
//         arr[i+1]=arr[i];
//     }
//     arr[0]=k;


// for(int i=0;i<=n;i++){
//     System.out.println(arr[i]);
// }

// for(int i =0;i<=arr.length;i++){
//     int temp  = arr[n];  // 2 in temp
//     arr[n] = arr[n--];

//     arr[i] = k;  
//     arr[n+1] = temp;
//     System.out.println(arr[i]);
//     // arr[i+1] = temp; //

//     // System.out.println(arr[i]);
// }


       }
    
}
