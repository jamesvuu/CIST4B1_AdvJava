public class KitchenLinkedList {
    // head which will point to first active order in the list
    private Node<Order1> head;
    // tail will point to last active order
    private Node<Order1> tail;
    // this will keep track of how many active orders are in the list
    private int size;

    public KitchenLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size; 
    }
    // add an active order to end of list
    public void addLast(Order1 order) {
        Node<Order1> newNode = new Node<>(order);

        //if list is empty new node becomes head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // if not put the new node after the current tail
            tail.next = newNode;
            // move tail forward to the new last node
            tail = newNode;
        }
        size++;
    }

    // remove and return the first ordrer

    public Order1 removeFirst() {
        if (head == null) {
            return null;
        }

        // saving the order we are removing
        Order1 removedOrder = head.data;

        // move head to the next node
        head = head.next; 

        // if list became empty then tail should go null
        if (head == null) {
            tail = null;
        }

        size--;
        return removedOrder;
    }

    // print all orders

    public void printList() {
        if (head == null) {
            System.out.println("Kitchen list is empty");
            return;
        }

        System.out.println("Active kitchen Orders:");

        Node<Order1> current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next; 
        }
     }
}
