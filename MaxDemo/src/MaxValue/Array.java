package MaxValue;

import java.util.Arrays;

public class Array {
    public void updateArray(int[] a){
        a[3] = 50;
        for(int i : a){
            System.out.print(i + "   ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Array dan = new Array();
        int[] xiong = {1,2,3,4,5,6,7,8};
        dan.updateArray(xiong);
        System.out.println(Arrays.toString(xiong));
    }
}
