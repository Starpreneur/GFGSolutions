package Solutions;

public class LongestKUniqueSubString {


    public int findLongest(String str,int k){

        int[] dictionary = new int[128];
        int longest = 0;

        int i=0,j=0,unique=0,n=str.length();
        while(j<n){

            while(j<n){
                if (dictionary[str.charAt(j)] == 0)unique++;
                dictionary[str.charAt(j)]++;

                if (unique > k)break;
                j++;
            }

            if (unique > k)longest = Math.max(longest,j-i+1);
            if (j == n)break;

            while(i<n){
                if (dictionary[str.charAt(i)] == 1)unique--;
                dictionary[str.charAt(i)]--;

                if (unique == k)break;
                i++;
            }
            i++;
            j++;
        }

        if (longest == 0)return -1;
        else return longest;
    }
}
