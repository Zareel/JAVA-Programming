public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArr(rightShiftArr(arr));

    }
    // right shift
    public static int[] rightShiftArr(int[] arr){
        int N = arr.length;
        int temp = arr[N-1];
        int[] result = new int[N];
        for(int i = 1; i < N; i++){
            result[i] = arr[i-1];
        }
        result[0] = temp;
        return result;
    }

    // print arr
    public static void printArr(int[] arr) {
        int N = arr.length;
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
