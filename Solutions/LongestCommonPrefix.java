package Solutions;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String findLongestPrefix(String[] arr){

        int n = 0;
        StringBuilder builder = new StringBuilder();
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }

        if (arr[0].length() > arr[arr.length-1].length()){
            n = arr[arr.length-1].length();
        }else {
            n = arr[0].length();
        }
        for (int i=0;i<n;i++){
            if (arr[0].charAt(i) != arr[n-1].charAt(i)){
                break;
            }else {
                builder.append(arr[0].charAt(i));
            }
        }

        return builder.toString();


    }
}
