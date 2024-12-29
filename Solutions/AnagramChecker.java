package Solutions;

import java.util.Arrays;
import java.util.Collections;

public class AnagramChecker {

    public boolean checkAnagram(String s1,String s2){

        if (s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
