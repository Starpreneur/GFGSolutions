package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumPairsWith0Sum {

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
                ArrayList<Integer> list1 = new ArrayList<>();
                if (complement < 0) {
                    list1.add(complement);
                    list1.add(val);
                }else{
                    list1.add(val);
                    list1.add(complement);
                }
                list.add(list1);
                map.remove(complement);
                map.remove(val);
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
