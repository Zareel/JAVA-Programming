public class MaxOfIthRow {
    public static void main(String[] args){
        int[][] mat = new int[3][4];
        int N = mat.length;
        int M = mat[0].length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                mat[i][j] = (int)Math.floor(Math.random() * 9);
            }
        }
        printMat(mat);
        int max = maxAtIthRow(mat, 1);
        System.out.println(max);

    }

    // max at ith row
    public static int maxAtIthRow(int[][]mat, int k){
        int M = mat[0].length;
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < M; j++){
            if(mat[k][j] > max){
                max = mat[k][j];
            }
        }
        return max;
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
