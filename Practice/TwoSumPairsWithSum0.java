package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPairsWithSum0 {

    public ArrayList<ArrayList<Integer>> process(int[] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int element : arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }

        for (int val : arr){
            int complement = -val;
            if (val == complement){
                continue;
            }
            if (map.containsKey(complement)){
                int min = Math.min(val,complement);
                int max = Math.max(val,complement);
                list.add((ArrayList<Integer>) Arrays.asList(min,max));

                map.remove(val);
                map.remove(complement);
            }
        }

        list.sort((a,b) -> {
            if (!a.get(0).equals(b.get(0))){
                return a.get(0)-b.get(0);
            }

            return a.get(1)-b.get(1);
        });

        return list;
    }
}
