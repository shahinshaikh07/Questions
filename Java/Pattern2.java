public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        int k = 1;
        for(int i = 1;i< n;i++){
            for(int j =1;j<n;j++){
                if(i>=j){
                    System.out.print(k+" ");k++;

                }else{
                    System.out.print(" ");
                }
            

            }
            System.out.println();
        }
    }
}
