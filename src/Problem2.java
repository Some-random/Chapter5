/**
 * Created by Bob_JIANG on 8/14/2015.
 */
public class Problem2 {
    public static String printBinary(double n) {
        if(n >= 1 || n <= 0) {
            return "ERROR";
        }
        StringBuilder SB = new StringBuilder();
        SB.append('.');
        while(n != 0) {
            if(SB.length() > 32) {
                return "ERROR";
            }
            n *= 2;
            if(n >= 1) {
                SB.append('1');
                n -= 1;
            }
            else {
                SB.append('0');
            }
        }
        return SB.toString();
    }

    //Remember how to represent double in binary
    public static void main(String args[]) {
        String bs = printBinary(.125);
        System.out.println(bs);

        for (int i = 0; i < 1000; i++) {
            double num = i / 1000.0;
            String binary = printBinary(num);
            //String binary2 = printBinary2(num);
            if (!binary.equals("ERROR")) {
                System.out.println(num + " : " + binary);
            }
        }
    }
}
