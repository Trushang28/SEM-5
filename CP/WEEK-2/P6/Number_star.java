import java.util.Scanner;

public class Number_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
           if(i<=n){
            for(int j=1;j<=n-i+1;j++)
                System.out.print(j);
            for(int j=1;j<2*i-2;j++)
                System.out.print("*");
            for(int j=n-i+1;j>0;j--)
                System.out.print(j);
           } 
            System.out.println();
        }

        for(int i=1;i<=n;i++){
           
                for(int j=1;j<=i;j++)
                    System.out.print(j);
                for(int j=1;j<=2*n-2*i;j++)
                    System.out.print("*");
                for(int j=i;j>0;j--)
                    System.out.print(j);
            System.out.println();
        }

        sc.close();
    }
}