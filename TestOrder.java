public class TestOrder {
    public static void main(String[] args) {
        Item item1 = new Item("Mocha", 3.5);
        // System.out.println(item1.getName() + " " + item1.getPrice());
        Item item2 = new Item("Latte", 3);
        // System.out.println(item2.getName() + " " + item2.getPrice());
        Item item3 = new Item("Drip Coffee", 2.5);
        // System.out.println(item3.getName() + " " + item3.getPrice());
        Item item4 = new Item("Capuccino", 3);
        // System.out.println(item4.getName() + " " + item4.getPrice());


        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        // System.out.println(order1.getName() + " " + order1.getReady() + " " + order1.getItems());
        Order order2 = new Order();
        // System.out.println(order2.getName() + " " + order2.getReady() + " " + order2.getItems());

        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Chris");
        // System.out.println(order3.getName() + " " + order3.getReady() + " " + order3.getItems());

        Order order4 = new Order("Sarah");
        // System.out.println(order4.getName() + " " + order4.getReady() + " " + order4.getItems());

        Order order5 = new Order("John");
        // System.out.println(order5.getName() + " " + order5.getReady() + " " + order5.getItems());


        // Add at least 2 items to each of the orders using the addItem method you wrote, 
        // for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: 
        order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item1);
        order4.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item4);


        //Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        // System.out.println(order1.getOrderTotal());
        // System.out.println(order2.getOrderTotal());
        // System.out.println(order3.getOrderTotal());
        // System.out.println(order4.getOrderTotal());
        // System.out.println(order5.getOrderTotal());


        //Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
        // order1.display();
        // order2.display();
        // order3.display();
        // order4.display();
        // order5.display();


        //Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. 
        //For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order3.setReady();
        order5.setReady();
        // System.out.println(order1.getStatusMessage());
        // System.out.println(order2.getStatusMessage());
        // System.out.println(order3.getStatusMessage());
        // System.out.println(order4.getStatusMessage());
        // System.out.println(order5.getStatusMessage());
    }
}
