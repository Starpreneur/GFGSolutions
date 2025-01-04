package Solutions;

public class ExcelSheetColumnAndNumber {

    //finding column in an excel sheet is like converting decimal to 26 based indexing

    public String findColumn(int n){ //1525

        StringBuilder builder = new StringBuilder();
        while(n>0){
            n = n-1;
            int remainder = n % 26;
            builder.append((char) ('A'+(remainder)));
            n = n/26;
        }
        return builder.reverse().toString();

    }

    public int findNumberFromColumn(String str){
        char[] ch = str.toCharArray();
        int k=ch.length-1,result = 0;
        for (int i=0;i<ch.length;i++){
            result = result + (((int)((ch[i]-'A')+1)) * (int)(Math.pow(26,k)));
            k--;
        }

        return result;
    }


}
