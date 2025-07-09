package AL;
import java.util.ArrayList;
public class DivisibleByTwo {
    public static void main(String[] args){
       
        int N = 5;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int ele = (int)Math.floor(Math.random() * 9);
            al.add(ele);
        }
        System.out.println(al);
        System.out.println(divisibleBy2(al));
    }

    // divisibe by Two

    public static ArrayList<Integer> divisibleBy2(ArrayList<Integer> al){
        int N = al.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;  i < N; i++){
            if(al.get(i) % 2 == 0){
                result.add(al.get(i));
            }
        }
        return result;
    }
    
}
