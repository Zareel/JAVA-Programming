import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args){
        /*
        Problem Description
        Take T (number of test cases) as input.
        For each test case, take integer N as input and Print the count of digits of that number.
         */

        Scanner sc =  new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= T; i++){
            int N = sc.nextInt();
            if(N == 0){
                count = 1;
            }else{
                while(N > 0){
                    N /= 10;
                    count += 1;

                }
            }
            System.out.println(count);

        }

    }
}
