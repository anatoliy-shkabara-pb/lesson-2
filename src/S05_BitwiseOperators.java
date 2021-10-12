public class S05_BitwiseOperators {
    public static void main(String[] args) {
        int a = 0b0011_1100;	// 60
        int b = 0b0000_1101;	// 13
        int c;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        c = a & b;       // 12 = 0000 1100
        System.out.println("a & b = " + Integer.toBinaryString(c));

        c = a | b;       // 61 = 0011 1101
        System.out.println("a | b = " + Integer.toBinaryString(c) );

        c = a ^ b;       // 49 = 0011 0001
        System.out.println("a ^ b = " + Integer.toBinaryString(c) );

        c = ~a;          // -61 = 1100 0011
        System.out.println("~a = " + Integer.toBinaryString(c) );
        System.out.println("~a = " + c);

        c = a << 2;     // 240 = 1111 0000
        System.out.println("a << 2 = " + Integer.toBinaryString(c) );

        c = a >> 2;     // 215 = 1111
        System.out.println("a >> 2  = " + Integer.toBinaryString(c) );

        c = a >>> 2;     // 215 = 0000 1111
        System.out.println("a >>> 2 = " + Integer.toBinaryString(c) );
    }
}
