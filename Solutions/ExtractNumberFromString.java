package Solutions;

import java.util.ArrayList;
import java.util.List;

public class ExtractNumberFromString {

    public long process(String str){

        List<Integer> list = new ArrayList<>();
        long max = -1;
        String[] arr = str.split("\\s");
        for(int i=0;i<arr.length;i++) {
            boolean isDigit = arr[i].matches("-?\\d+(\\.\\d+)?");
            if (isDigit) {
                  boolean ifContains9 = contains9(arr[i]);
                  if (!ifContains9){
                      list.add(Integer.parseInt(arr[i]));
                  }
            }
        }
        for (int i=0;i<list.size();i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }

    public boolean contains9(String str){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == '9'){
                return true;
            }
        }
        return false;
    }


}
