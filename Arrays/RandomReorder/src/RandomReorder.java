import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Randomly Reorder Array in O(N)
 * Given: (a) rand() method which generates numbers between 0 and 1 (b) floor function. eg: floor(2.88)=2
 *
 * Tutorial link: https://www.youtube.com/watch?v=CoI4S7z1E1Y
 */

public class RandomReorder {
    public static void main(String[] args){
        /*Random random=new Random();
        System.out.println(random.nextFloat());
        System.out.println(Math.floor(4*random.nextFloat()));*/

        List<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(0);
        array.add(3);
        array.add(9);
        array.add(2);

        System.out.println("Initial Array\n"+array);
        reorder(array);
        System.out.println("Final Array\n"+array);
    }

    private static void reorder(List<Integer> array) {
        for(int i=array.size()-1;i>=0;i--){
            Random random=new Random();
            int randomIndex= ((int) Math.floor(i * random.nextFloat()));
            Integer temp=array.get(i);
            array.set(i,array.get(randomIndex));
            array.set(randomIndex,temp);
        }
    }
}
