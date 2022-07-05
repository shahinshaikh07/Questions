public class Palindrome {
    public static void main(String[] args){
        // String str =  "ABCDCBA";
        String str =  "Shahin";
        int n = str.length();
       int ans = 0;
    
        for(int i =0 ;i< n/2;i++){
            if(str.charAt(i) == str.charAt(n-i-1))
            {
                ans = 1;
// System.out.println("Palindrome");
            }
            else{
                // System.out.println("Not Palindrome");
                ans = 2;
            }
        }

        if (ans == 1) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }

//      if(ans == true)
//      {
// System.out.println("Palindrome");
//      }
//      else{
//  System.out.println("Not Palindrome");
//      }
     

    }
}