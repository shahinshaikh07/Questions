public class RecOcr {
private static void ocr(String s, char c, int i){
    if(i==0) return;
  if(s.charAt(i) == c){
       System.out.println(i);
       if(i == 0){
        return;
    }
    }
    ocr(s, c,i-1);   
}
    public static void main(String[] args) {
        String str = "shahinh";
        char c = 'h';
        int index = str.length();
     
        ocr(str, c,  index-1);
    }
}
