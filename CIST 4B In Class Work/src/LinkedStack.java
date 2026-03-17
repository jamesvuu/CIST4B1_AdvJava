public class LinkedStack {
    private Node top;


    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            return - 1;
        }

        int value =  (int) top.data; 
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            return - 1;
        }
        return (int) top.data; 
    }
}
