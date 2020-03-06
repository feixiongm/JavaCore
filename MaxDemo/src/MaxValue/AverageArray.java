package MaxValue;

public class AverageArray {
    public void Average(int[] arr){
        float sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];
        }
        float aver = sum / arr.length;

        System.out.println("shabi " + aver);
    }
    public static void main(String[] args){

        AverageArray dan = new AverageArray();

        int [] xiong = {2, 3, 4};

        dan.Average(xiong);
    }
}
