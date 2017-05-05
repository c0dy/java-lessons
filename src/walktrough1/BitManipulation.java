package walktrough1;

import java.util.Random;

/**
 * Created by codyy on 10/23/2016.
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("max+ ", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("mag- ", maxneg);
        printBinaryInt("i ", i);
        printBinaryInt("~i ", ~i);
        printBinaryInt("-i ", -i);
        printBinaryInt("j ", j);
        printBinaryInt("i&j ", i & j);
        printBinaryInt("i|j ", i | j);
        printBinaryInt("i^j ", i ^ j);
        printBinaryInt("i<<5 ", i << 5);
        printBinaryInt("i>>5 ", i >> 5);
        printBinaryInt("(~i)>>5 ", (~i) >> 5);
        printBinaryInt("i>>>5 ", i >>> 5);
        printBinaryInt("(~i)>>>5 ", (~i) >>> 5);
        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L ", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("ll ", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("lln ", lln);
        printBinaryLong("l ", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m ", m);
        printBinaryLong("l&m ", l & m);
        printBinaryLong("l|m ", l | m);
        printBinaryLong("l^m ", l ^ m);
        printBinaryLong("l<<5 ", l << 5);
        printBinaryLong("l>>5 ", l >> 5);
        printBinaryLong("l>>>5 ", l >>> 5);
        printBinaryLong("(~l)>>>5 ", (~l) >>> 5);
    }
        static void printBinaryInt(String s, int i ) {
        System.out.println(s + ",int: " + i + ", double: \n  " +
                Integer.toBinaryString(i));
        }
        static void printBinaryLong(String s, long l ) {
        System.out.println(s + ",long: " + l + ", double: \n  " +
                Long.toBinaryString(l));
        }

}

