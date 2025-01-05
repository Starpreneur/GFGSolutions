package Practice;

import Array.TwoSumPairsWith0Sum;

public class Main2 {

    public static void main(String[] args){

        TwoSumPairsWith0Sum sumPairsWith0Sum = new TwoSumPairsWith0Sum();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(sumPairsWith0Sum.process(arr));
    }
}
