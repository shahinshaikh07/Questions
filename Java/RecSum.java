public class RecSum{

public static void printAdd(int n, int sum) {
   
    if(n == 0){
System.out.println(sum);
    return;}
     sum = sum + n;
    printAdd(n-1, sum);
}

public static void main(String[] args) {
    int sum = 0;
    int n = 5;
    printAdd(n, sum);
    
}
}