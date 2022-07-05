public class FindOccr {
public static int first = -1;
public static int last = -1;
public static void occr(String s, char c, int i) {
   if(i == s.length()){     // after complete string is traversed   
       System.out.println(first);
       System.out.println(last);
       return;
   } 
char curr = s.charAt(i);
if(curr == c){
    if(first == -1){    //first is updated once  
        first = i;
    } else{           //last is updated many times, it will hold the last value
        last = i;
    }
}


    occr(s, c, i+1);
}


    public static void main(String[] args) {
        String s = "shahinashaikhamyanameias";
        char c = 'a';
        char index = 0;
        occr(s,c, index);
        
    }
}
