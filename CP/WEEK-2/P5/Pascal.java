import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pascal [][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==i){
                    pascal[i][j] = 1;
                }else{ 
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(pascal[i][j] != 0){
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }    
}
