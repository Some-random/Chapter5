import CtCILibrary.CtCILibrary.AssortedMethods;

/**
 * Created by Bob_JIANG on 8/14/2015.
 */
public class Problem1 {
    public static int updateBits(int a, int b, int i, int j) {
        //get the mask, first part
        int mask = ~0;
        int secondmask = ((1 << (j + 1 - i)) - 1) << i;
        int realmask = mask ^ secondmask;

        int atemp = (a & realmask);

        int returnvalue = (atemp | (b << i));
        return returnvalue;
    }

    //Finished Problem1, first taste of bit operation in Java, notice the -1 thingy
    public static void main(String[] args) {
        int a = 103217;
        System.out.println(AssortedMethods.toFullBinaryString(a));
        int b = 13;
        System.out.println(AssortedMethods.toFullBinaryString(b));
        int c = updateBits(a, b, 4, 12);
        System.out.println(AssortedMethods.toFullBinaryString(c));
    }

}
