
public class Recursion1{

public static void printNumb(int m) {
    if( m > 10)
    return;
    System.out.println(m);
    printNumb(m+1);
    
}
    public static void printNum(int n){
        if(n == 0)
        return;
        System.out.println(n);
printNum(n-1);
    }

public static void main(String[] args) {
    int n = 5;
    int m = 1;
    printNum(n); 
    System.out.println("Hello Descending");
    printNumb(m);
    System.out.println("Hello Ascending");
}
}