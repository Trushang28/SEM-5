import java.util.Scanner;
public class Left_Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=n;
        for(int i=1;i<2*n;i++)
        {
             if(n-i>0)
             {
                 for(int j=0;j<x-1;j++)
                      System.out.print(" ");
                  for(int j=0;j<x;j++)
                      System.out.print("*");
                 x--;
             }
            else
            {
                for(int j=0;j<x-1;j++)
                      System.out.print(" ");
                for(int j=0;j<x;j++)
                      System.out.print("*");
                 x++;
            }
            System.out.println();
        }
        sc.close();
    }
}