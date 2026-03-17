public class Stack<T> {
    private int maxSize;
    private int currSize;
    private Object[] data;

    public Stack(int maxSize) {
        this.maxSize = maxSize; 
        data = new Object[maxSize];
        this.currSize = 0;
    }

    public void push(T item) {
        if(currSize < maxSize) {
            data[currSize] = item;
            currSize++;
        } else {
            Object[] newData = new Object[this.maxSize * 2];
            for (int i = 0; i < this.maxSize; i++) {
                newData[i] = this.data[i];
            }

            newData[this.currSize] = item;
            this.data = newData;
            this.maxSize *= 2;
            this.currSize++;
        }
    }

    

    public T pop() {
        if(currSize > 0) {
            T retValue = (T) data[currSize];
            currSize--;
            data[currSize+1] = null;
            return retValue; 
        } else {
            System.err.println("Error: Attempting to remove from empty stack.");
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
