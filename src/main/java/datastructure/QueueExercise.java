package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        System.out.println(q.peek());
        q.add(2);
//        System.out.println(q.peek());
        q.add(3);
        q.add(4);
        q.offer(5);
        q.poll();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
