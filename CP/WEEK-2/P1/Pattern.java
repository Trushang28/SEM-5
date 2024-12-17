

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j <2*n-1; j++){
                System.out.print(Math.max((n-i)<=0?i-n+2:n-i,(n-j)<=0?j-n+2:n-j));
            }
            
            System.out.println();
        }
    }
}
