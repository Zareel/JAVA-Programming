
import java.util.ArrayList;
import java.util.Scanner;

public class Print2DArrayList {
    public static void main(String[] args) {
         ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0;i < N; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < M; j++){
                int val = sc.nextInt();
                row.add(val);
            }
            al.add(row);
        }
        System.out.println(al);
    }
    
}
