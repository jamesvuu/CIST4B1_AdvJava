//  I asked CHATGPT for help aboout if I should set my waiting Queue shorter to test if it grows, and 
// I also asked if it would work if I were to reverse my for loop
// I also tried asking to help with my summary but it didn't really help me at all
// https://chatgpt.com/share/69b03b3e-8404-8001-9640-1dc377d8b99f


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

  
        Queue<Order1> waitingQueue = new Queue<>(2);     
        KitchenLinkedList kitchen = new KitchenLinkedList();
        ArrayList<Order1> completedOrders = new ArrayList<>();

        DineInOrder o1 = new DineInOrder(1, "Jason", 0, 12);
        o1.addItem("Chicken Bowl", 10.99);
        o1.addItem("Water", 0.00);

        TakeoutOrder o2 = new TakeoutOrder(2, "Amy", 1, true);
        o2.addItem("Burger", 9.50);
        o2.addItem("Fries", 3.25);

        TakeoutOrder o3 = new TakeoutOrder(3, "Ben", 2, false);
        o3.addItem("Salad", 8.25);


        System.out.println(" enqueue orders in waiting line ");
        waitingQueue.enqueue(o1);
        waitingQueue.enqueue(o2);
        waitingQueue.enqueue(o3);

     
        System.out.println("Next order to be served: " + summary(waitingQueue.peek()));
        System.out.println("Waiting queue size: " + waitingQueue.size());

        System.out.println("processing orders");

        while (!waitingQueue.isEmpty()) {

            Order1 next = waitingQueue.dequeue();
            System.out.println("dequeued: " + summary(next));

      
            kitchen.addLast(next);
            System.out.println("added to kitchen list: " + summary(next));

            
            ArrayList<String> stepsList = next.buildSteps();

           
            Stack<String> stepsStack = new Stack<>(stepsList.size());

            for (int i = stepsList.size() - 1; i >= 0; i--) {
                stepsStack.push(stepsList.get(i));
            }


            System.out.println("prep the steps for this order:");
            while (!stepsStack.isEmpty()) {
                String step = stepsStack.pop();
                System.out.println("  - " + step);
            }

            
            next.markCompleted();
            completedOrders.add(next);

          
            Order1 removedFromKitchen = kitchen.removeFirst();
            System.out.println("removed from kitchen list: " + summary(removedFromKitchen));
        }


        System.out.println("Completed Orders");
        for (Order1 order : completedOrders) {
            System.out.println(summary(order) + " | Completed? " + order.isCompleted());
        }

        System.out.println("Done");
    }


    private static String summary(Order1 order) {
        if (order == null) {
            return "null";
        }

        return "[ID=" + order.getOrderId()
                + ", Name=" + order.getCustomerName()
                + ", Type=" + order.getOrderType()
                + ", Items=" + order.getItemCount()
                + ", Total=$" + String.format("%.2f", order.getTotalPrice())
                + ", ArrivedStep=" + order.getArrivalTimeStep()
                + "]";
    }
}