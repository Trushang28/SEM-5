import java.util.Scanner;
public class TwoKnights {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int k=1; k<=n; k++) {
            long total = (long)k*k*(k*k-1)/2;
            long attack = 4*(k-1)*(k-2);
            System.out.println(total-attack);
        }
    }
}
