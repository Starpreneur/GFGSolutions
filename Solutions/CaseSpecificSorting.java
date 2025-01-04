package Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseSpecificSorting {

    public String process(String str){
        char[] chars = str.toCharArray();
        List<Character> lowerCase = new ArrayList<>();
        List<Character> upperCase = new ArrayList<>();

        for (char ch : chars){
            if (ch >= 97 && ch <=122){
                lowerCase.add(ch);
            }else if (ch >= 65 && ch <= 90){
                upperCase.add(ch);
            }
        }

        Collections.sort(lowerCase);
        Collections.sort(upperCase);

        int i=0,j=0,k=0;
        StringBuffer buffer = new StringBuffer();
        while(k<str.length()){
            if (str.charAt(k) >= 97 && str.charAt(k) <=122){
                buffer.append(lowerCase.get(i));
                i++;
            } else if (str.charAt(k) >= 65 && str.charAt(k) <= 90) {
                buffer.append(upperCase.get(j));
                j++;
            }
            k++;
        }


        return buffer.toString();
    }
}
