package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class StringsRotatedByTwoPlaces {

    public String function(String str1){

        Queue<Character> queue = new LinkedList<>();
        for (int i=0;i<str1.length();i++){
            queue.add(str1.charAt(i));
        }

        int n=0;
        while(n<2){
            Character ch = queue.peek();
            queue.poll();
            queue.add(ch);
            n++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<str1.length();i++){
            builder.append(queue.poll());
        }
        return builder.toString();

    }
}
