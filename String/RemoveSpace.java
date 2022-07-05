public class RemoveSpace {
    public static void main(String[] args) {
        String str = "take you forward";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                str = str.substring(0,i) + str.substring(i+1);
        
        i--;
            }
        }
         System.out.println(str);
    }
}
