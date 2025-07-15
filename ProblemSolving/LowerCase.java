public class LowerCase {
      public static void main(String[] args) {
     String str = "Zareel Kalam";
        System.out.println(lowerCase(str));
    }
    public static String lowerCase(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0;  i < n; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}
