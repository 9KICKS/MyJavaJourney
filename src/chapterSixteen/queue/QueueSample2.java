package chapterSixteen.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueSample2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(3);
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.offer(4));
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}
