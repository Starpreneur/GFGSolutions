package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {

    public ArrayList<Integer> process(int[] arr){

        int[] m = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        int[] frequency = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }

        for (int i=1;i<frequency.length;i++){
            if (frequency[i] == 0){
                m[0] = i;
            } else if (frequency[i] > 1) {
               m[1] = i;
            }
        }
        int j=0;
        list.add(m[j+1]);
        list.add(m[j]);
        return list;
    }
}
