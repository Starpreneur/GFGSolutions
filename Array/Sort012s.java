package Array;

public class Sort012s {

    public void process(int[] arr){//0,1,0,1,2,1,2

        int[] frequency = new int[3];
        for (int j : arr) {
            frequency[j]++;
        }
        int m=0,l=0;
        for (int i=0;i<frequency.length;i++){
            int k=frequency[i];
            for (;m<l+k;m++){
                arr[m] = i;
            }
            l=m;
        }
        for (int j:arr) {
            System.out.print(j+" ");
        }
    }
}
