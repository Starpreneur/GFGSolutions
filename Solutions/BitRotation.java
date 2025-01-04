package Solutions;

import java.util.*;

public class BitRotation {

    public List<String> process(int n,int d){
        List<String> list = new ArrayList<>();
        String binaryStr = convertToBinary(n);
        System.out.println(binaryStr);
        String leftRotated = leftRotate(binaryStr,d);
        System.out.println(leftRotated);
        String rightRotated = rightRotate(binaryStr,d);
        String res1 = convertToDecimal(leftRotated);
        list.add(res1);
        String res2 = convertToDecimal(rightRotated);
        list.add(res2);
        return list;
    }

    public String convertToBinary(int n){
        StringBuilder builder = new StringBuilder();
        while(n>0){
            int remainder = n%2;
            builder.append(String.valueOf(remainder));
            n=n/2;
        }
        String bstr =  builder.reverse().toString();
        return formatBinaryString(bstr,16);
    }

    public String formatBinaryString(String binary,int length){
        if (binary.length() < length){
            return "0".repeat(length-binary.length())+binary;
        }
        else if (binary.length() > length) {
            return binary.substring(binary.length() - length);
        }
        // Return as is if the length matches
        return binary;
    }

    public String convertToDecimal(String s){
        int n = s.length(),result=0,k=0;

        for (int i=n-1;i>=0;i--){
            result = result + ((s.charAt(k)-'0') * (int)Math.pow(2,i));
            k++;
        }

        return String.valueOf(result);
    }


    public String leftRotate(String bit, int k){

        Queue<Character> queue = new LinkedList<>();

        for (int i=0;i<bit.length();i++){
            queue.add(bit.charAt(i));
        }


        while(k>0){
            char ch = queue.peek();
            queue.poll();
            queue.add(ch);
            k--;
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0;i< bit.length();i++){
            builder.append(queue.poll());
        }
        return builder.toString();
    }

    public String rightRotate(String s,int k){

         int n = s.length();
         k = k%n;

         String lastPart = s.substring(n-k);
         String firstPart = s.substring(0,n-k);

         return lastPart+firstPart;
    }
}
