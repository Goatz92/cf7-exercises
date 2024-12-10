package gr.aueb.cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;
        try {
            push(1);
            push(2);
            push(3);
            printStack();
            num = pop();
            printStack();
            System.out.println("Popped Num: " + num);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void push (int num) throws Exception {

        try {
            if (isFull()) throw new Exception("Error. Stack is Full");
            myStack[++top] = num;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static int pop () throws Exception{

        try {
            if (isEmpty()) throw new Exception("Error. Stack is Empty");
            return myStack[top--];
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean isEmpty () {
        return top == -1;
    }

    public static boolean isFull () {
        return top == myStack.length -1;
    }

    public static void printStack () throws Exception {

        try {
            if (isEmpty()) {
                throw new Exception("Stack. Is Empty");
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(myStack[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
