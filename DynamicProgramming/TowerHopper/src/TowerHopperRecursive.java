import java.util.ArrayList;
import java.util.List;

/**
 * Tower Hopper problem.
 * Given: n towers with their heights. If u stand at tower of height h, u can jump atmost h steps forward.
 * Find if it is possible to jump outside the array.
 *
 * Tutorial link: https://www.youtube.com/watch?v=kHWy5nEfRIQ
 *
 * Recursive solution below
 */
public class TowerHopperRecursive {
    public static void main(String[] args){
        List<Integer> towers=new ArrayList<>();

        //Success Case
        /*towers.add(4);
        towers.add(2);
        towers.add(0);
        towers.add(0);
        towers.add(2);
        towers.add(0);*/

        //Failure Case
        towers.add(1);
        towers.add(0);

        System.out.println(isHoppable(towers));
    }

    private static boolean isHoppable(List<Integer> towers) {
        return isHoppable(0,towers);
    }

    private static boolean isHoppable(int index, List<Integer> towers) {
        if(towers.get(index)==0) return false;
        if(index+towers.get(index)>=towers.size()) return true;
        else {
            for(int i=index+1;i<=index+towers.get(index);i++){
                 if(isHoppable(i,towers)==true) return true;
            }
        }
        return false;
    }
}
