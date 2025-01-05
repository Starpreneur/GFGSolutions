package Array;

import java.util.Arrays;

public class FindMissingInteger {

    public int process(int[] arr){
        int n = arr.length,i=0;
        Arrays.sort(arr);
        int missingVal = arr[n-1]+1;
        if (arr[0] != 1){
            return 1;
        }

        while(i<n-1){
            if (arr[i+1] != arr[i]+1){
                missingVal = arr[i]+1;
                return missingVal;
            }
            i++;
        }
        return missingVal;
    }
}
