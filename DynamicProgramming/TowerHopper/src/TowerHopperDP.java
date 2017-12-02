import java.util.ArrayList;
import java.util.List;

/**
 * Tower Hopper problem.
 * Given: n towers with their heights. If u stand at tower of height h, u can jump atmost h steps forward.
 * Find if it is possible to jump outside the array.
 *
 * Tutorial link: https://www.youtube.com/watch?v=kHWy5nEfRIQ
 */
public class TowerHopperDP {
    public static void main(String[] args){
        List<Integer> towerHeight=new ArrayList<>();

        //Success Case
        towerHeight.add(4);
        towerHeight.add(2);
        towerHeight.add(0);
        towerHeight.add(0);
        towerHeight.add(2);
        towerHeight.add(0);

        //Failure Case
        /*towerHeight.add(1);
        towerHeight.add(0);*/

        System.out.println(isHoppable(towerHeight));
    }

    private static boolean isHoppable(List<Integer> towerHeight) {
        boolean[] hoppable=new boolean[towerHeight.size()];
        setHoppable(towerHeight,hoppable);
        return hoppable[0];
    }

    private static void setHoppable(List<Integer> towerHeight, boolean[] hoppable) {
        for(int i=towerHeight.size()-1;i>=0;i--){
            if(towerHeight.get(i)==0) hoppable[i]=false;
            else if((towerHeight.get(i)+i) >= towerHeight.size()) hoppable[i]=true;
            else {
                for(int j=i+1;j<=i+towerHeight.get(i) && j<=towerHeight.size();j++){
                    if(hoppable[j]==true){
                        hoppable[i]=true;
                        break;
                    }
                }
            }
        }
    }

}
