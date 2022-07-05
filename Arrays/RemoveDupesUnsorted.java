public class RemoveDupesUnsorted {
    //Problem 12
    public static void main(String[] args) {
        int arr[] = {2,3,1,9,3,1,3,9};
       // int arr[] = {4, 3, 9, 2, 4, 1, 10, 89, 34}; 
        int n = arr.length;
        int mark[] = new int[n];

        for(int i=0;i<n;i++){
            mark[i] = 0;
        }

        for(int i = 0; i< n; i++)
        {
            if(mark[i] == 0)
            {
                for(int j =i+1;j<n ;j++)
                {
                    if(arr[i] == arr[j])
                    {
                    mark[i] = 1;
                }
            }
        }
    }

        for(int i = 0; i<n; i++){
            if(mark[i] == 0){
                System.out.println( arr[i]);
            }
        }
    }
}
