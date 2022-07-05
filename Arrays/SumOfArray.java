public class SumOfArray {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        int arr[] = {1,2,1,1,5,1};
        int n = arr.length;
        int sum = 0;

        for(int i =0;i<n;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println(sum);
        

    }
}
