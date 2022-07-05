public class RecPower {
public static int power(int x, int n) {
 if(n == 0){return 1;}
 
 if(x == 0){return 0; }
  
 
 int xpow = power(x, n-1);
 int xp = x * xpow;
 return xp;

}

public static void main(String[] args) {
    int x = 5;
    int n = 10;
   int ans = power(x,n);  
   System.out.println(ans);
}

//     public static void pow(int x, int n, int k) {   //9,2,3
//   if(n==0 || n==1){
//     System.out.println(x);
//     return;}
//      x = x*k; 
//         pow(x, n-1,k);   //18,1,3
//     }
//     public static void main(String[] args) {
//         int x = 5;
//         int n = 10;
//         int k = x;
//      pow(x, n, k);
      
//     }
    
}
