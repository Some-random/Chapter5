import CtCILibrary.CtCILibrary.AssortedMethods;

/**
 * Created by Bob_JIANG on 8/14/2015.
 */
public class Problem6 {
    public static int swapOddEvenBits(int x) {
        return ( ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1) );
    }

    //lol... using hex numbers is cheating...
    public static void main(String[] args) {
        int a = 103217;
        System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
        int b = swapOddEvenBits(a);
        System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
    }
}
