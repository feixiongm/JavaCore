package MaxValue;

public class ArrayMethod {
    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayMethod nums1 = new ArrayMethod();
        ArrayMethod nums2 = new ArrayMethod();
        int[] abc = {1,2,3,4,5};
        int[] asd = {10,20,30,40,50};
        nums1.printArray(asd);
        nums2.printArray(abc);
    }
}
