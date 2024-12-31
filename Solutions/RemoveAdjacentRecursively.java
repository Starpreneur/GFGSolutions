package Solutions;

public class RemoveAdjacentRecursively {

    public String process(String str){

        int n=str.length();
        boolean repeated = false;
        StringBuilder builder  =new StringBuilder();

        for (int i=0;i<n;i++){
            repeated = false;
            if (i+1<n && str.charAt(i) == str.charAt(i+1)){
                repeated = true;
                i++;
            }

            if (!repeated){
                builder.append(str.charAt(i));
            }
        }

        if (builder.length() == n)
            return builder.toString();
        else
            return process(builder.toString());

    }
}
