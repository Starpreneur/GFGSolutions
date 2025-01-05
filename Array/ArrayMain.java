package Array;

public class ArrayMain {

    public static void main(String[] args){


        TwoSumPairsWith0Sum sumPairsWith0Sum = new TwoSumPairsWith0Sum();
        int[] arr ={6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        System.out.println(sumPairsWith0Sum.process(arr));
    }
}
