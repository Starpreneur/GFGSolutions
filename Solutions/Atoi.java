package Solutions;

public class Atoi {

    public int function(String str){

        int i=0,n=str.length();
        int sign = 1;
        int result = 0;

        while(i<n && str.charAt(i) == ' '){
            i++;
        }

        if (i< n){
           if (str.charAt(i) == '-'){
               sign = -1;
               i++;
           }else {
               sign = 1;
           }
        }

        while(i<n && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i)-'0';

            if (result > (Integer.MAX_VALUE-digit)/10){
                return Integer.MAX_VALUE*sign;
            }

            result = result*10 + digit;
            i++;
        }
        return result*sign;
    }
}
