public class SumOfithRow {
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
        int sum = sumOfIthRow(mat, 1);
        System.out.println(sum);
    }
    // sum of ith row
    public static int sumOfIthRow(int[][] mat, int k){
        int sum = 0;
        for(int j = 0; j < mat[0].length; j++){
            sum += mat[k][j];
        }
        return sum;
    }

    // print mat

      public static void printMat(int[][] mat){
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
