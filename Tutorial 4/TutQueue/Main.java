public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.front());
        System.out.println("Back element: " + queue.back());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.enqueue(40);
        System.out.println("Enqueued element: " + 40);
        queue.enqueue(50);
        System.out.println("Enqueued element: " + 50);
        System.out.println("Queue is full: " + queue.isFull());
    }
}
