package Solutions;

import java.util.HashMap;
import java.util.Map;

public class SubStringsWithKUniqueChars { //aabaaca"

    public int numOfSubStrings(String str,int k){

        Map<Character,Integer> map = new HashMap<>();
        int i=0,j=0,count=0,n=str.length();

        while(j<n){
            char ch = str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size() > k){
                char chAtI = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)-1);

                if (map.get(chAtI) == 0){
                    map.remove(chAtI);
                }
                i++;
            }

            count = count + (j-i+1);
            j++;
        }
        return count;

    }

    public int process(String s,int k){
        if (k==0)return 0;
        return numOfSubStrings(s,k)-numOfSubStrings(s,k-1);
    }
}
