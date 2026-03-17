import java.util.ArrayList;


public class TakeoutOrder extends Order1 {


        private boolean needsUtensils;

        public TakeoutOrder(int orderID, String customerName, int arrivalTime, boolean needsUtensils) {

            super(orderID, customerName, arrivalTime);
            this.needsUtensils = needsUtensils;
        }

        @Override 
        public String getOrderType() {
            return "Takeout";
        }

        @Override
        public ArrayList<String> buildSteps() {
            
            ArrayList<String> steps = new ArrayList<>();

            steps.add("Cook food");
            steps.add("Pack food in container");
            if (needsUtensils) {
                steps.add("add utensils");
            }

            steps.add("Hand to customer");

            return steps;
        }

}
