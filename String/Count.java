public class Count {
    public static void main(String[] args) {
        //String str = "Take u forward is Awesome";
        String str = "India won the cricket match";
        str = str.toLowerCase();
        int n = str.length();
        int vowels = 0;
        int conso = 0;
        int whitespace = 0;
        for(int i = 0; i< n; i++){
           char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
//   System.out.println(str.charAt(i));
vowels++; }
else if(ch >= 'a' && ch <= 'z'){
    conso++;}
    else if(ch == ' '){
        whitespace++;
    }
           
        }

       System.out.println("Vowels = " +vowels);
         System.out.println("Consonants = " +conso);
           System.out.println("WhiteSpaces = " +whitespace);
    }
}
