package CODEFORCES;
import java.util.*;
public class Three_Piles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for(int i =0; i<t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            long diff = Math.abs(a - b);
 
            long ans;
 
            if(a>b){
                ans = diff + c;
            } else {
                ans = Math.max(diff, Math.abs(diff - c));
            }
 
            System.out.println(ans);
        }
    }
    
}