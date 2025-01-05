package Array;

public class KadaneAlgo {

    public int process(int[] arr){

        int n=arr.length,currentMax =0,globalMax=0;
        for (int i=0;i<n;i++){
            if (currentMax+arr[i] > arr[i]){
                currentMax = currentMax+arr[i];
            }else{
                currentMax=arr[i];
            }

            if (currentMax>globalMax) {
                globalMax = currentMax;
            }
        }

        return globalMax;
    }
}
