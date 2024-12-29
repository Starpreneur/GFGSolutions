package Solutions;

public class LongestPalindromicString {

    public String findLongestPalindrome(String str){

        int i=0,j=0,fi=0,fj=0,n=str.length();

        for (int k=0;k<n;k++){

            i=k-1;
            j=k+1;
            while(i>=0 && j<n){
                if (str.charAt(i) != str.charAt(j)){
                    break;
                }
                i--;
                j++;
            }

            if (j-i-1 > fj-fi+1){
                fj = j-1;
                fi = i+1;
            }

            if (k+1 < n && str.charAt(k) == str.charAt(k+1)){

                i=k-1;
                j=k+2;

                while(i>=0 && j<n){
                    if (str.charAt(i) != str.charAt(j)){
                        break;
                    }
                    i--;
                    j++;
                }

                if (j-i-1 > fj-fi+1){
                    fj=j-1;
                    fi=i+1;
                }
            }


        }

        return str.substring(fi,fj+1);
    }
}
