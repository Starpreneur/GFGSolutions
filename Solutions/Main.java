package Solutions;

public class Main {

    public static void main(String[] args){

       RomanToInteger toInteger = new RomanToInteger();
       System.out.println(toInteger.convert("IVCM"));

       RemoveAdjacentRecursively removeAdjacentRecursively = new RemoveAdjacentRecursively();
       System.out.println(removeAdjacentRecursively.process("abccbccba"));

       LongestKUniqueSubString kUniqueSubString = new LongestKUniqueSubString();
       System.out.println(kUniqueSubString.findLongest("aabacbebebe",3));


    }
}
