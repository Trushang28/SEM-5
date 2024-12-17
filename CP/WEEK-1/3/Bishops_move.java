import java.util.Scanner;

public class Bishops_move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int tl=Math.min(r-1, c-1);
        int tr=Math.min(r-1,8-c);
        int bl=Math.min(8-r,c-1);
        int br=Math.min(8-r,8-c);
        int move = tl+tr+bl+br;
        System.out.println(move);
        sc.close();
    }
}
