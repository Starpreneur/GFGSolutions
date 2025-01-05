package Array;

public class InversionCount {

    public int process(int[] arr){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                 if (arr[i] > arr[j]){
                     count++;
                 }
            }
        }

        return count;
    }
}
