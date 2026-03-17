import java.util.ArrayList;

public abstract class Order1 {

    private int orderID;


    private String customerName;


    private ArrayList<String> items;


    private double totalPrice;


    private int arrivalTimeStep;


    private boolean completed; 

    public Order1(int orderID, String customerName, int arrivalTimeStep) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.arrivalTimeStep = arrivalTimeStep;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.completed = false;
    }

   
    public void addItem(String itemName, double itemPrice) {
        items.add(itemName);
        totalPrice += itemPrice;
    }


    public void markCompleted() {
        completed = true; 
    }



    public int getOrderId() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getArrivalTimeStep() {
        return arrivalTimeStep;
    }

    public boolean isCompleted() {
        return completed; 
    }


    public int getItemCount() {
        return items.size(); 
    }

    public abstract String getOrderType();


    public abstract ArrayList<String> buildSteps();


}
