package gr.aueb.cf.ch6;

public class MyStack {

    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num = 1;
            for (int i = 0; i < stack.length; i++){
                push(num);
            }
    printStack();
    }

    public static void push(int num) {

        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = num;
    }

    public static int pop () {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top--];
    }

    private static boolean isFull () {
        return top == stack.length - 1;
    }

    private static boolean isEmpty () {
        return top == -1;
    }

    public static void printStack() {

        if (isEmpty()) System.out.println("Stack is Empty");
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i]);
        }
    }
}
