package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOfSubArray {

    public ArrayList<Integer> process(int[] arr,int target){

        ArrayList<Integer> listOfIndexes = new ArrayList<>();
        int i=0,j=0,sum=0,n=arr.length;
        while(j<n){

            sum = sum+arr[j];
            while(sum > target && i<=j){
                sum=sum-arr[i];
                i++;
            }

            if (sum==target){
                listOfIndexes.add(i+1);
                listOfIndexes.add(j+1);
                return listOfIndexes;
            }
            j++;
        }

        listOfIndexes.add(-1);
        return listOfIndexes;
    }
}
