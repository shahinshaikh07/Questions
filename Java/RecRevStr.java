public class RecRevStr {
    private static void revStr(String s, int i) {

if(i == 0){
System.out.print(s.charAt(i));
return;}
 System.out.print(s.charAt(i));

revStr(s, i-1);   //    ,3
      
    }
   
    public static void main(String[] args) {
        String str = "my name is shahin shaikh ";
        int index = str.length();
       revStr(str, index-1);   // "abcd", 4
// System.out.println(str.charAt(1));
    }
}
