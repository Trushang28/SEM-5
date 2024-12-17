import java.math.BigInteger;
import java.util.Scanner;

public class Trailing_Os {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        int i=5;
        int count = 0;
        while (n.intValue()/i>0) {
            count+=n.intValue()/i;
            i = i*5;
        }
        System.out.println(count);
    }
    
}