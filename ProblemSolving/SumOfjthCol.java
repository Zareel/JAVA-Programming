public class SumOfjthCol {
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
        int sum = sumOfIthCol(mat, 1);
        System.out.println(sum);
    }

    // sum of ith col
    public static int sumOfIthCol(int[][] mat, int k){
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][k];
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
