package Solutions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorialOfLargeNumber {

    public List<Integer> factorial(int n){
        List<Integer> list = new ArrayList<>();
        BigDecimal fctrl = BigDecimal.valueOf(1);
        for (int i=n;i>1;i--){
            fctrl = fctrl.multiply(BigDecimal.valueOf(i));
        }
        while(fctrl.compareTo(BigDecimal.valueOf(0)) > 0){
            BigDecimal remainder = fctrl.remainder(BigDecimal.valueOf(10));
            fctrl =   fctrl = fctrl.divideToIntegralValue(BigDecimal.TEN);
            list.add(remainder.intValue());
        }

        Collections.reverse(list);
        return list;
    }
}
