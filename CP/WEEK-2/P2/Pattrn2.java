import java.util.Scanner;

public class Pattrn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        
                for(int j=0;j<n-i;j++){
                        System.out.printf("%c",'A'+j);
                }
               
             
                for(int j=0;j<2*i-1;j++)
                {
                    System.out.print(" ");
                }
                int j=n-i-1;
                if(i==0){
                    j--;
                }
                for( ;j>=0;j--){
                  
                    System.out.printf("%c",'A'+j);
               }
              
               

            System.out.println(); 
        }
        sc.close();
     }
}
