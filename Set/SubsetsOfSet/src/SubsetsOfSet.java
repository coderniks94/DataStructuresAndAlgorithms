import java.util.*;

/**
 * Print all subsets of a given set
 */
public class SubsetsOfSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(8);
        //set.add(5);
        //set.add(6);

        printSubsets(set);
    }

    private static void printSubsets(Set<Integer> set) {
        if (set.isEmpty()) return;

        List<Integer> setElements = new ArrayList<>(set);
        List<Integer> subsetList = new ArrayList<>();
        Integer index = new Integer(0);

        System.out.println("All elements: " + setElements);
        printSubsets(setElements);
    }

    private static void printSubsets(List<Integer> setElements) {
        int n = setElements.size();
        int l = (int) Math.pow(2, n);
        for (int i = 0; i <= l - 1; i++) {
            System.out.print("{");
            for (int j = 0; j <= n-1; j++) {
                if ((i & (1<<j)) != 0) System.out.print(setElements.get(j));
            }
            System.out.print("}");
            System.out.println();
        }

    }


}
