package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates {

    public ArrayList<Integer> process(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > 1)
                list.add(entry.getKey());
        }

        return list;
    }
}
