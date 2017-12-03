import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array(not necessarily sorted) return true if there are 2 numbers with sum S
 */
public class PairWithSumX {
    public static void main(String[] args){
        List<Integer> array=new ArrayList<>();

        //success case
        /*array.add(1);
        array.add(4);
        array.add(45);
        array.add(6);
        array.add(10);
        array.add(-8);*/

        array.add(1);
        array.add(4);
        array.add(45);
        array.add(3);
        array.add(10);
        array.add(-8);

        Integer sum=16;

        System.out.println(hasPairWithSum(array,sum));
    }

    private static boolean hasPairWithSum(List<Integer> array, Integer sum) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(Integer value:array){
            if(hashSet.contains(sum-value)) return true;
            hashSet.add(value);
        }
        return false;
    }
}
