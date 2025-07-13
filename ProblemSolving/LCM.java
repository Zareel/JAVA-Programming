import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(findGCD(A, B));
    }
    public static int findGCD(int A, int B){
       int min = 0;
       if(A < min){
           min = A;
       }else{
           min = B;
       }
        int gcd = 1;
        for(int i = min; i >= 1; i--){
            if(A % i == 0 && B % i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
