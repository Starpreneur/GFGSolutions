package Solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {

    public String function(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            builder.append(entry.getKey()).append(entry.getValue());
        }

        return builder.toString();
    }
}
