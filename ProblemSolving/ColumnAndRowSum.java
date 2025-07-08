
import java.util.Arrays;

public class ColumnAndRowSum {
    public static void main(String[] args) {

        int[][] mat = new int[3][4];
        int N = mat.length;
        int M = mat[0].length;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                mat[i][j] = (int)Math.floor(Math.random()*9);
            }
        }
        printMat(mat);
        int[] ans = colAndRowSum(mat);
        System.out.println(Arrays.toString(ans));
    }
    // row and col sum
    public static int[] colAndRowSum(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        int[] result = new int[N + M];
        // row sum
        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = 0; j < M; j++){
                sum += mat[i][j];
            }
            result[i] = sum;
        }
        // col sum
        for(int j = 0; j < M; j++){
            int sum = 0;
            for(int i = 0;i < N; i++){
                sum += mat[i][j];
            }
            result[N + j] = sum;
        }
        return result;
    }

    // print mat
    public static void printMat(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
