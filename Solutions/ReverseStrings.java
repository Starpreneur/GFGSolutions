package Solutions;

public class ReverseStrings {

    public void reverse(String str){

       String[] arr = str.split("\\s");
       StringBuilder builder = new StringBuilder();

       for (int i=arr.length-1;i>=0;i--){
           if (i != 0)
           builder.append(arr[i]).append(" ");
           else
               builder.append(arr[i]);
       }
       String str1 =  builder.toString().trim();
       System.out.println("String after reversing : "+ str1);

    }
}
