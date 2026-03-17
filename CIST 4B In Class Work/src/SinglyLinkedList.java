public class SinglyLinkedList<T> {
    public Node<T> head;
    public int length;

    public SinglyLinkedList() {
        this.head = null;
        length = 0;
    }

    public void append (T data) {

        Node<T> current = head;
        while (current.next !=null) {
            current = current.next; 
        }

        current.next = new Node<T>(data);
        this.length += 1;
    }

    public void prepend (T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;;
    }

    public void print() {
        Node<T> curr = this.head;
        while (curr.next != null) {
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }
        System.err.println(curr.data);
    }

    public void insertAt(T target, T newData) {
    Node<T> current = head;

    // search for target
    while (current != null && current.data != target) {
        current = current.next;
    }

    // not found
    if (current == null) {
        throw new IllegalArgumentException("not found");
    }

    // found and then insert after current
    current.next = new Node<T>(newData);
    }

    public T removeValue(T data) {
        if(this.head == null) {
            return null;
        }

        if(this.head.data == data) {
            T returnData = this.head.data;
            this.head = this.head.next; 
            this.length--;
            return returnData; 
        }
        Node<T> curr = this.head; 
        while (curr.next != null) {
            if(curr.next.data == data) {
                T returnData = (T) curr.next.data;
                curr.next = curr.next.next; 
                this.length--;
                return returnData;
            }
            curr = curr.next;
        }
        return null;
    }

    // Search

    public boolean search(T target) {
        Node<T> curr = this.head; 
        while (curr != null) {
            if(curr.data == target) {
                return true;
            }
            curr = curr.next;
        }

        return false; 

    }


    // remove based on index (add later)
    // public T removeIndex() { }

public boolean isEmpty() {
    if (this.head == null) {
        return true;
    }
    return false;
    }

    public int getLength() {
        return this.length;
    }
    
}
