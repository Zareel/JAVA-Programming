import javax.net.ssl.SSLServerSocket;
import java.util.Scanner;

public class PrintEvenTopToBottom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = N; i >= 0; i--){
            if(i % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
