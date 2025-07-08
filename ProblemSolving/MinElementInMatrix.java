public class MinElementInMatrix {
    public static void main(String[] args){
            int[][] mat = new int[3][4];
        int N = mat.length;
        int M = mat[0].length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                mat[i][j] = (int)Math.floor(Math.random() * 50);
            }
        }
        System.out.println("Here is random 2D array");
        printMat(mat);
        int minValue = minElement(mat);
        System.out.println("min value is: " + minValue);
    }
    //    find min element
    public static int minElement(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(mat[i][j] < min){
                    min = mat[i][j];
                }
            }
        }
        return min;
    }

//    print mat
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
