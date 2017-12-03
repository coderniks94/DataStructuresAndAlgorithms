/**
 * Count no of bits to be flipped to convert number A to number B
 */

public class FlippedBitsFromAtoB {
    public static void main(String[] args) {
        Integer a = 4, b = 5;
        System.out.println("No of bits to be flipped: " + Integer.bitCount(a ^ b));
    }
}
