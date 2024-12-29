package Solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public char function(String string){

        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

      for (Map.Entry<Character,Integer> entry : map.entrySet()){
          if (entry.getValue() == 1){
              return entry.getKey();
          }
      }

      return '$';

    }
}
