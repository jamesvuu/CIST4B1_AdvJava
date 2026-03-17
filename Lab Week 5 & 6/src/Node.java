public class Node<T> {
    // data stored in the node
    public T data;

    // link to next node

    public Node<T> next;

    Node(T data) {
        // store the value that is passed in
        this.data = data;

        // new node does not point to anything 
        this.next = null; 
    }
}
