package Array;

public class LongestSubArrayWithSumK {

    public int process(int[] arr,int k){

        int i=0,j=0,n=arr.length,sum=0,maxLength = 0;
        while(j<n){
            sum = sum+arr[j];

            while(sum > k && i<=j) {
                sum = sum - arr[i];
                i++;
            }
            if (sum == k){
                maxLength = Math.max(maxLength,j-i+1);
            }
            j++;
        }

        return maxLength;
    }
}
