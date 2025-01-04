package Solutions.BitRotations;

import java.util.ArrayList;
import java.util.List;

public class RotateBitsPrac {

    public List<String> process(int num,int k){
        List<String> list = new ArrayList<>();
        String binaryRep = convertToBinary(num);
        list.add(convertToDecimal(rotateLeft(binaryRep,k)));
        list.add(convertToDecimal(rotateRight(binaryRep,k)));
        return list;
    }

    public String convertToBinary(int n){
        StringBuffer buffer = new StringBuffer();
        while(n>0){
            int remainder = n % 2;
            buffer.append(remainder);
            n = n/2;
        }
        return formatString(buffer.reverse().toString(),16);

    }

    public String formatString(String str,int length){
        return "0".repeat(length-str.length())+str;
    }

    public String convertToDecimal(String s){
        int result = 0,n,k=0;

        for (n=s.length()-1;n>=0;n--){
            result = result + ((s.charAt(k)-'0') * (int)Math.pow(2,n));
            k++;
        }

        return String.valueOf(result);
    }

    public String rotateLeft(String str,int k){
        int n = str.length();
        k = k%n;
        String left = str.substring(0,k);
        String right = str.substring(k+1);

        return right+left;
    }

    public String rotateRight(String str,int k){
        int n = str.length();
        k = k%n;

        String right = str.substring(n-k);
        String left = str.substring(0,n-k);

        return right+left;
    }
}
