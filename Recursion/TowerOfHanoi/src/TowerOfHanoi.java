package src;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        char fromPeg = 'a';
        char toPeg = 'c';
        char auxPeg = 'b';
        toh(numberOfDisks, fromPeg, toPeg, auxPeg);
    }

    private static void toh(int numberOfDisks, char fromPeg, char toPeg, char auxPeg) {
        if (numberOfDisks == 1) {
            System.out.println("Move " + numberOfDisks + " from " + fromPeg + " to " + toPeg);
            return;
        }
        toh(numberOfDisks-1,fromPeg,auxPeg,toPeg);
        System.out.println("Move " + numberOfDisks + " from " + fromPeg + " to " + toPeg);
        toh(numberOfDisks-1,auxPeg,toPeg,fromPeg);

    }


}
