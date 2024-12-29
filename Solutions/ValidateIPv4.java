package Solutions;

public class ValidateIPv4 {

    public boolean validateAddress(String ipv4){

        String[] array = ipv4.split("\\.");
        if (array.length != 4) {
            return false;
        }
        for (String s : array){
            if (s.isEmpty()){
                return false;
            }
            if (isValid(s)){
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public boolean isValid(String ip){
        if (ip.length() > 1 && ip.charAt(0) == '0'){
            return false;
        }
        int num = Integer.parseInt(ip);
        if (num >= 0 && num <= 255)
            return true;
        else
            return false;
    }
}
