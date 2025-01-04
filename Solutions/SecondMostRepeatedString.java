package Solutions;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedString {

    public String process(String[] str){

        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i<str.length;i++){
            map.put(str[i],map.getOrDefault(str[i],0)+1);
        }

        int max=0,secondMax = 0;
        String mostRepeated = "";
        String secondMost = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() > max){
                secondMax = max;
                max = entry.getValue();
                secondMost = mostRepeated;
                mostRepeated = entry.getKey();
            }else if (entry.getValue() > secondMax){
                secondMax = entry.getValue();
                secondMost = entry.getKey();
            }
        }

        return secondMost;

    }
}
