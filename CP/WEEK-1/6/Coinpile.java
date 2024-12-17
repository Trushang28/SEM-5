import java.math.BigInteger;
import java.util.Scanner;

public class Coinpile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if((a.intValue()+b.intValue())%3==0 &&  a.intValue()<=2*b.intValue() && b.intValue()<=2*a.intValue()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        
         }
        sc.close();
    }
}
