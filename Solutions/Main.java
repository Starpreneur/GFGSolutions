package Solutions;

public class Main {

    public static void main(String[] args){

        ValidateIPv4 iPv4 = new ValidateIPv4();
        String ip = "01.01.01.01";
        System.out.println("Is "+ip+" valid IPv4 Address : "+iPv4.validateAddress(ip));


        FirstNonRepeatingCharacter nonRepeatingCharacter = new FirstNonRepeatingCharacter();
      System.out.println(nonRepeatingCharacter.function("aabbccc"));



    }
}
