package Solutions;

public class ConvertBinaryToDecimal {

    public String process(String str){

        char[] nums = str.toCharArray();
        int i=nums.length-1;
        int result = 0;

        for (int k=0;k<str.length();k++){
            result = result+((nums[k]-'0') * ((int) Math.pow(2,i)));
            i--;
        }

        return String.valueOf(result);
    }
}
