import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<>();

    public Order(){
        this.name = "Guest";
    }

    public Order(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(){
        this.ready = true;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item i : getItems()){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + this.name);
        for (Item i : getItems()){
            System.out.printf("%s - $%.2f%n",i.getName(), i.getPrice());
        }
        System.out.printf("Total: $%.2f%n%n", this.getOrderTotal());
    }
}
