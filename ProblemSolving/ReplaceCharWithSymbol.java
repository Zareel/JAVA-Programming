public class ReplaceCharWithSymbol {
    public static void main(String[] args) {
        // given a string of length n and a char B. Replace all the occurance of B in the string with @
        String str = "Programming";
            char B = 'a';
        System.out.println(replaceChar(str, B));
    }
    public static String replaceChar(String str, char B){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == B){
                sb.append('@');
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}
