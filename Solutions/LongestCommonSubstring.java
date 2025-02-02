package Solutions;

public class LongestCommonSubstring {

    public int function(String s1,String s2){

        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        int maxLength = 0;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){

                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    maxLength = Math.max(maxLength,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;

    }
}
