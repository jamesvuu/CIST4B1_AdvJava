// notes
// constructor runs head = 0, tail = 0
// items get added
// itesm get removed
// everytime you remove, head moves forward

public class Queue<T> {
    private Object[] data;
    private int size;
    private int head;
    private int tail; 

    public Queue(int size) {
        // array with starting capacity 
        data = new Object[size];
        // begining queue has 0 items in it
        this.size = 0;
        head = 0; 
        tail = 0;
    }

    public void enqueue(T item) {
        // if queue is full grow array
        if (size == data.length) {
            // make a new array that is twice as big so we can continue to keep going if full
            Object[] newData = new Object[data.length * 2];

            // copy elements over in the correct queue order 
            // FIFO first in, first out
            for (int i = 0; i < size; i++) {
                // start at head move forward "i" spots
                // if you go past the end
                // wrap back to front
                // so it all goes into correct order of FIFO
                newData[i] = data[(head + i) % data.length];
            }
            // replace old array with bigger one
            data = newData;

            // reset head to 0 
            head = 0; 
            // tail should go right after last real element
            tail = size; 
        }
        // puts the new item at the tail position 
        this.data[this.tail] = item; 

        // move tail forward by 1
        // % data length makes the queue wrap around to front if needed
        this.tail = (this.tail + 1) % data.length;
        // added an item to increase the size 
        size++; 
    }

    public T dequeue() {
        // if queue is empty then print error 
        if (size == 0) {
            System.err.println("Error: Attmepting to remove from empty queue");
            return null;
        } else {

            // get the item at the front of the queue 
            T retValue = (T) this.data[this.head];

            // clear that spot in the array 
            this.data[this.head] = null; 

            // move the head forward by 1

            this.head = (this.head + 1) % data.length;

            // item was removed so decrease size
            this.size--;

            return retValue; 
            
        }
    }
    // looks at the next item in the queue
    public T peek() {
        // if one item return front item
        if (size > 0) {
            return (T) this.data[this.head];

        }
        // if empty, return null;
        return null;

    }

    public boolean isEmpty() {
    return size == 0; 
    }

    public int size() {
        return size; 
    }
}
