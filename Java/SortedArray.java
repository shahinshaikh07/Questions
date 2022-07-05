public class SortedArray {
public static boolean sort(int arr[], int i) {
if(i == arr.length -1){
return true;}

    if(arr[i] < arr[i+1]){
         return sort(arr, i+1);
    }
    else 
      {return false;
    }    
  
}

 public static void main(String[] args) {
int arr[] = {0,1,2,3,4,5,6};
System.out.println(sort(arr, 0));
    //  sort(arr, 0);
 }
}
