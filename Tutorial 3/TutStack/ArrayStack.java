public class ArrayStack {
    int size;
    int top;
    int[] arr;

    public ArrayStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            arr[++top] = element;
            System.out.println("Inserted " + element + ".");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int element = arr[top--];
            System.out.println("Popped element is " + element + ".");
            return element;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            System.out.println("Peek element is " + arr[top] + ".");
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}