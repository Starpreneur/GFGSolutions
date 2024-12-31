package Solutions;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringsRotationOfEachOther {

    public boolean function(String str1,String str2){
        Queue<Character> queue1 = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();

        for (int i=0;i<str1.length();i++){
            queue1.add(str1.charAt(i));
        }

        for (int j=0;j<str2.length();j++){
            queue2.add(str2.charAt(j));
        }

        int n = str1.length();
        while(n>0){
            Character ch = queue1.peek();
            queue1.poll();
            queue1.add(ch);
            if (queue1.equals(queue2)){
                return true;
            }
            n--;
        }
        return false;
    }
}
