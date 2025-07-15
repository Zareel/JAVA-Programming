public class LengthOfTheLongestWord {
    public static void main(String[] args) {
          String str = "My name is zareel kalam and i am a software engineer and a programmer";
        System.out.println(longestWordInString(str));
    }
    public static int longestWordInString(String str){
        int n = str.length();
        int current = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                current++;
            }else {
                if(current > max){
                    max = current;
                }
                current = 0;
            }
        }
    // check last word
    if(current > max) {
        max = current;
    }
        return max;
}
    
}
