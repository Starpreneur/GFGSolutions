package Solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {



    public String convert(String romanVal){

        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);

        char[] arr = romanVal.toCharArray();
        int result=0,prevVal = 0;;

       for (int i=0;i<arr.length;i++){
           char currentChar = arr[i];
           int currentVal = romanToValue.get(currentChar);


           if (currentVal > prevVal) {
               result = result + (currentVal-(2*prevVal));
           }else {
               result = result + currentVal;
           }
           prevVal = currentVal;
       }

       return String.valueOf(result);
    }


}
