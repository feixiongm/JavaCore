package MaxValue;

import java.util.Arrays;

public class fac {
    public void fac(int n,int m){
        int s = 1,sum = 0;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++){
            s = s * i;
            arr[i] = s;
        }
        for (int i = 0; i <= m; i++){
            sum = sum + arr[i];
        }
       System.out.println(Arrays.toString(arr) + "," + sum);
    }
    public static void main(String[] args){
        fac face = new fac();
        int a = 8,b = 5;
        face.fac(a,b);
    }
}
