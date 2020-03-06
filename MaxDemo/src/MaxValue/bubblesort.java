package MaxValue;

public class bubblesort {
    public static void main(String[] main) {
        int[] a = new int[]{12, 345, 2, 5, 676, 456, 234};
        for (int n : a) {
            System.out.print(n + "  ");
        }
        System.out.println();
        int temp;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1;j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int n : a){
            System.out.print(n + "  ");
        }
        System.out.println();
    }
}
