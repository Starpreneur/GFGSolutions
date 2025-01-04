package Solutions;

public class RemoveDuplicates {

    public String remove(String str){//gfgtrg
        int[] dictionary = new int[128];
        StringBuilder builder = new StringBuilder();

        for (int i=0;i<str.length();i++){
            dictionary[str.charAt(i)]++;
        }

        for (int i=0;i<str.length();i++){
            if (dictionary[str.charAt(i)] != 0) {
                builder.append(str.charAt(i));
                dictionary[str.charAt(i)] = 0;
            }
        }
        return builder.toString();
    }
}
