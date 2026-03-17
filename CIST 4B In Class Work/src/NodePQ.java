public class NodePQ<T> {
    // data
    public T data;

    //link 
    public Node left;
    public NodePQ right;

    NodePQ(T data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }

    
}
