public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArr(leftShiftArr(arr));

    }


    // left shift
    public static int[] leftShiftArr(int[] arr) {
        int N = arr.length;
        int temp = arr[0];
        int[] result = new int[N];
        for(int i = 0; i < N-1; i++){
            result[i] = arr[i + 1];
        }
        result[N-1] = temp;
        return result;
        
    }

    // print arr
        public static void printArr(int[] arr){
        int N = arr.length;
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
