package Solutions;

public class Palindrome {

    public boolean checkPalindrome(String str){

        int n = str.length();
        int i=0,j=n-1;

        while(i<=j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
}
