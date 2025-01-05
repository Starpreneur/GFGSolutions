package Array;

public class SecondLargestElement {

    public int process(int[] arr){
        int max=-1,secondMax=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i]!= max) {
                secondMax = arr[i];
            }
        }

        if (max == secondMax)
            return -1;
        else
            return secondMax;
    }
}
