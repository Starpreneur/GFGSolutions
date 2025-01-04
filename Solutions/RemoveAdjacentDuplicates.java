package Solutions;

public class RemoveAdjacentDuplicates {

    public String process(String str){//aabcc
        StringBuilder builder = new StringBuilder();
        int i=0,n=str.length();
        char[] ch = str.toCharArray();
        while(i<n){
            if (i<n-1 && ch[i] == ch[i+1]){
                builder.append(ch[i]);
                i=i+2;
            }else {
                builder.append(ch[i]);
                i++;
            }
        }

        if (builder.length() == n) {
            return builder.toString();
        }
        else {
            return process(builder.toString());
        }
    }
}
