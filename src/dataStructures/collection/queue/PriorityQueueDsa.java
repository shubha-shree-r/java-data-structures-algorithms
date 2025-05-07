package dataStructures.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDsa {
    private PriorityQueue<Integer> queue;
    private int maxSize;

    public PriorityQueueDsa(int capacity) {
        maxSize = capacity;
        queue = new PriorityQueue<>();
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add " + item);
        } else {
            queue.offer(item);
            System.out.println("Added: " + item);
        }
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = queue.poll();
        System.out.println("Removed: " + removed);
        return removed;
    }

    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue.peek();
    }

    public boolean isFull() {
        return queue.size() >= maxSize;
    }

    public void display() {
        System.out.println("Queue elements: " + queue);
    }

    public static void main(String[] args) {
        PriorityQueueDsa pq = new PriorityQueueDsa(3);

        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(40); // should show full

        pq.display(); // should be sorted as [10, 30, 20] internally but not guaranteed in order

        System.out.println("Peek: " + pq.peek());

        pq.dequeue();
        pq.display();
    }
}
