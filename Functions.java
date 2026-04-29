import java.util.*;

public class Functions {
    public static int findMax(ArrayList<Integer> arr){
        int max= arr.get(0);
        for(int i = 1 ; i < arr.size(); i++){
            if (arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;     
    }
}
