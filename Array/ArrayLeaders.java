package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    public List<Integer> process(int[] arr){

        int n=arr.length;
        List<Integer> leaders = new ArrayList<>();
        int currentLeader = arr[n-1];
        leaders.add(currentLeader);

        for (int i=n-2;i>=0;i--){
            if (arr[i] >= currentLeader){
                currentLeader = arr[i];
                leaders.add(currentLeader);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}
