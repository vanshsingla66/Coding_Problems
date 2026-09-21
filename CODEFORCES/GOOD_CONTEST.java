package CODEFORCES;
import java.util.*;

class GOOD_CONTEST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int[] arr = new int[3];
            int min = 10;
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
                min = Math.min(min,arr[i]);
            }
            
            System.out.println(n-min);
        }
        sc.close();
    }
}