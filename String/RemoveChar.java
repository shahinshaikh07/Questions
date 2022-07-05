public class RemoveChar {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == '1'){
                
str = str.substring(0,i) + str.substring(i+1);
i--;
            }
        }

System.out.println(str);
    }
}
