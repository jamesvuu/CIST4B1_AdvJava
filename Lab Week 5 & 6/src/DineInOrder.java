import java.util.ArrayList;

public class DineInOrder extends Order1 {

    private int tableNumber; 

    public DineInOrder(int orderID, String customerName, int arrivalTimeStep, int tableNumber) {
        super(orderID, customerName, arrivalTimeStep);
        this.tableNumber = tableNumber;
    }

   
    public int getTableNumber() {
        return tableNumber; 
    }


    @Override 
    public String getOrderType() {
        return "Dine In";
    }

    @Override
    public ArrayList<String> buildSteps() {

        ArrayList<String> steps = new ArrayList<>();

 
        steps.add("Cook food");
        steps.add("Put food on plate");
        steps.add("Serve it to table "+ tableNumber);

        return steps;
    }
}
