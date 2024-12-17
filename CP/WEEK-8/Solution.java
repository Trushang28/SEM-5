import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack <Integer> stack = new Stack<>();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=a.length-1;i>0;i--){
            if (a[i]<0){
                if(a[i-1]>Math.abs(a[i])){
                    stack.push(a[i-1]);
                }
                else if(a[i-1]==Math.abs(a[i])){
                    
                }
                else
                    stack.push(a[i]);
            }
            else{
                if(a[i-1]<0){
                    if(a[i]>Math.abs(a[i-1])){
                        stack.push(a[i]);
                    }
                    else
                        stack.push(a[i-1]);  
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    sc.close();

}
}