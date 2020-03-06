package MaxValue;

import java.util.Scanner;

public class ArraySearch{
    public boolean search(int n, int[] arr){
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        if(flag ==true){
            System.out.println("找到了！");
        }else{
            System.out.println("没找到！");
        }
        return flag;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        ArraySearch dan = new ArraySearch();
        dan.search(n1,arr1);
    }
}
