//Java Program to demonstrate the working of
//PriorityQueue 
import java.util.*;
public class PriorityQueueDemo {
    //main method
    public static void main(String[] args){
        //Create an empty priorityQueue
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
        //Add elements to the priority queue
        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(15);
        //Printing the top element of  the priorityQueue
        System.out.println(pqueue.peek());
        //Printing the top element and removing it from the priorityQueue container
        System.out.println(pqueue.poll());
        //Printing the top element again
        System.out.println(pqueue.peek());
    }
}
