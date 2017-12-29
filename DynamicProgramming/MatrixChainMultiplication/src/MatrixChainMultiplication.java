import java.util.*;

/**
 * Given n matrices like (a x b) (b x c) (c x d)... represented as [a,b,c,d,...]
 * Find minimum number of multiplication operations to multiply in that order
 */
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(30);
        /*list.add(6);
        list.add(4);*/

        System.out.println("Minimum number of multiplicatiion operations: " + matrixChain(list));
    }

    private static Integer matrixChain(List<Integer> list) {
        return matrixChain(list, 1, list.size() - 1);
    }

    private static Integer matrixChain(List<Integer> list, int s, int e) {
        if (s >= e || s >= list.size() || e >= list.size()) return 0;
        if (e - s == 1) return list.get(s - 1) * list.get(s) * list.get(e);

        Integer maxValue = new Integer(0);

        for (int i = s; i <= e; i++) {
            Integer value = matrixChain(list, s, i) + matrixChain(list, i + 1, e);
            if (value > maxValue) maxValue = value;
        }
        List<Integer> myList=new ArrayList<>();
        Set<Integer> mySet=new HashSet<>();
        Map<Integer,String > myMap=new HashMap();
        return list.get(s - 1) * list.get(s) * list.get(e) + maxValue;


    }
}
