package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        // THIS IS A FIRST-IN-FIRST-OUT QUEUE  (FIFO)
        // whichever items comes in first , it will get removed first
        // when we use remove method from the Queue interface

        Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("review the class");
        taskQueue.add("refresh your memory");
        taskQueue.add("redo some of the tasks");
        taskQueue.add("focus on what you're not sure about");

        System.out.println("taskQueue = " + taskQueue);

        taskQueue.remove();
        taskQueue.remove();
        taskQueue.remove();

        //System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue = " + taskQueue);
    }
}
