public class Stack<T> {
    private int maxSize;
    private int currSize;
    private Object[] data; 
    
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        data = new Object[maxSize];
        this.currSize = 0; 
    }
    
    
    // add item to top of stack
    public void push(T item) {
        // if there is still space then add the item
        if (currSize < maxSize) {
            data[currSize] = item;
            currSize++;
        } else {
            // if full make a new array that is twice as large
            Object[] newData = new Object[this.maxSize * 2];

            // copy old data into bigger array
            for (int i = 0; i < this.maxSize; i++) {
                newData[i] = this.data[i];
            }
            // add the new item at top
            newData[this.currSize] = item;

            // replace old array with new bigger one
            this.data = newData;
            //update maxSize
            this.maxSize *= 2; 
            
            this.currSize++; 
        }
    }
    // remove from stack
    public T pop() {
        if (currSize > 0) {
            // move down first so curSize points to top item index
            currSize--;
            T retValue = (T) data[currSize];
            data[currSize] = null; 

            return retValue; 
        } else {
        System.err.println("Error: Attempting to remove from empty stack");
        return null;
        }

        
    } 

    public boolean isEmpty() {
        return currSize == 0;
    }

    public boolean isFull() {
        return currSize == maxSize; 
    }
}
