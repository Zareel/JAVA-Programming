
import java.util.Scanner;

public class CountUpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countCase(str);

    }

    // function
    public static void countCase(String str){
        int N = str.length();
        int countUpper = 0;
        int countLower = 0;
        for(int i = 0; i < N; i++){
            int ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                countLower++;
            }else{
                countUpper++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
    }
    
}
