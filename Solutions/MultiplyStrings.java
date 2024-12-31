package Solutions;

import java.math.BigDecimal;

public class MultiplyStrings {

    public String function(String str1,String str2){

       BigDecimal a = convertToInteger(str1);
       BigDecimal b = convertToInteger(str2);

       return (a.multiply(b)).toString();

    }

    public BigDecimal convertToInteger(String str){

        BigDecimal result= BigDecimal.valueOf(0);
        int i=0,sign=1,n=str.length();

        if (str.charAt(0) == '-'){
            sign = -1;
            i++;
        }else {
            sign = 1;
        }

        while(i<n && str.charAt(i) == '0'){
            i++;
        }

        while (i<n && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i)-'0';

            result = (result.multiply(BigDecimal.TEN)).add(BigDecimal.valueOf(digit));
            i++;
        }

        return result.multiply(BigDecimal.valueOf(sign));

    }
}
