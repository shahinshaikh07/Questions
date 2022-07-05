public class FrequencyOfElement {

    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        
        // Visited is an array of boolean type, with length n.
        boolean visited[] = new boolean[n];
        

        //outer loop, will traverse each element of array.
        for(int i =0;i< n; i++)
        {

            //check if the element of array is already visited or not.
            //initial value of Boolean will be false.
            //visited[0] will be false. the first time
            if(visited[i] == true)
            {
                //if the above condition is true, continue the loop for next element.
                
                continue;
            }

            int count =1;

            // j= i+1 -->>> means that the first element is 
            //compared to the second element of the array.
            for(int j=i+1;j<n;j++)
            {
                //if first element is equal to the second.
                // increase the count, and mark that element as visited.
                if(arr[i] == arr[j])
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" is present "+count+ " time." );
        }
    }
}