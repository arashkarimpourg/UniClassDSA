public class Queue {
    int maxSize;
    int[] queueArray;
    int front;
    int back;
    int numberOfItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        back = -1;
        numberOfItems = 0;
    }

    public void enqueue(int value) {
        if (back == maxSize - 1) {
            back = -1;
        }
        queueArray[++back] = value;
        numberOfItems++;
    }

    public int dequeue() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        numberOfItems--;
        return temp;
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    public int front() {
        return queueArray[front];
    }

    public int back() {
        return queueArray[back];
    }

    public int size() {
        return numberOfItems;
    }
}