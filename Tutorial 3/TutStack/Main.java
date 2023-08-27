public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        stack.push(4);
        stack.push(5);
        stack.push(9);
        stack.pop();
        stack.push(7);
        stack.peek();
    }
}
