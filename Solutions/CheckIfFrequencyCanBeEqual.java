package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckIfFrequencyCanBeEqual {

    public boolean process(String str){

        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        int k=0;
        boolean flag = false;
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++) {
                int diff = Math.abs(list.get(i) - list.get(j));
                if (diff > 1) {
                    return false;
                }
            }
        }


        return true;




    }
}
