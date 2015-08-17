import CtCILibrary.CtCILibrary.AssortedMethods;

/**
 * Created by Bob_JIANG on 8/14/2015.
 */
public class Problem5 {
    public static int change(int a, int b) {
        int count = 0;
        while(a > 0 && b > 0) {
            count += ((a & 1) ^ (b & 1));
            a >>= 1;
            b >>= 1;
        }
        while(a > 0) {
            count += (a & 1);
            a >>= 1;
        }
        while(b > 0) {
            count += (b & 1);
            b >>= 1;
        }
        return count;
    }

    //Hmm maybe xor a and b from the very beginning is a better way to approach this?
    public static void main(String[] args) {
        int a = 23432;
        int b = 512132;
        System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
        System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
        int nbits = change(a, b);
        System.out.println("Required number of bits: " + nbits);
    }

}
