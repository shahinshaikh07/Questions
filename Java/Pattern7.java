public class Pattern7 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1;i<n; i++)
        {
            for(int j =1;j<n;j++)
            {
                if(i+j<n+1){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
System.out.println();
        }
        
    }
}
