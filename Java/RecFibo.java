public class RecFibo {
public static void printFibo(int a, int b, int n) {
   if(n ==0 )
   return;

    int c = a + b;
    System.out.println(c);

    printFibo(b,c, n-1);
    
}


public static void main(String[] args) {
int a = 0;
int b = 1;
int n = 15;
System.out.println(a);
System.out.println(b);
    printFibo(a,b,n-2);
}





    // public static void fibo(int i, int a, int b, int c, int x){    // 0,0,1,0,10
    // c = a +b;  //c= 1, c=2
    //   System.out.println(c);  //1
    // if(i == x)  return;   //i increase hote hote jab 10 ho gya, it will return
    
    // fibo(i+1,b,c,c,x);   //1,1,1,1,10  //first c is in place of second number   //second c is for sum
    // }
    // public static void main(String[] args) {
    //     int x = 10;  //nth number
    //     int i=0;     //iterator
    // int a =0;   // first number
    // int b = 1;   //second number
    // int c = 0;    //sum calculator
    // System.out.println(a);
    // System.out.println(b);
    // fibo(i,a,b,c,x);  // 0,0,1,0,10
    // }
}
