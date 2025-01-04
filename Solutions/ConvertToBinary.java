package Solutions;

public class ConvertToBinary {

    public String process(int n){

        StringBuilder builder = new StringBuilder();
        while(n>0){
            int remainder = n % 2;
            builder.append(String.valueOf(remainder));
            n = n/2;
        }

        return builder.reverse().toString();
    }
}
