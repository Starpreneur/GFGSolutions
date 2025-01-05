package Array;

public class EquilibriumPoint {


    //TotalSumOfArray = RightSum + leftSum +arr[i]
    public int process(int[] arr){
        int totalSum = 0;
        for (int val : arr){
            totalSum = totalSum+val;
        }

        int leftSum=0;

        for (int i=0;i<arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];
            if (rightSum == leftSum) {
                return arr[i];
            }
            leftSum=leftSum+arr[i];
        }
        return -1;
    }
}
