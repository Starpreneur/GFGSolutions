package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

    public int process(int[] arr,int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<k;i++){
            priorityQueue.add(arr[i]);
        }

        //we will check remaining elements ,if element is smaller than the root we will replace the root as we have to include smaller elements in heap
        for (int i=k;i<arr.length;i++){
            if (arr[i] < priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        return priorityQueue.peek();
    }
}
