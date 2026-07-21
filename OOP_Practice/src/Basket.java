public class Basket {

    private String items;
    private int totalPrice;
    private int limit;

    // Constructor without parameters — initializes the item list once
    public Basket() {
        items = "List of items: ";
    }
    // Constructor with one parameter — sets the spending limit
    public Basket(int totalPriceLimit) {
        this();                    // calls the no-parameter constructor first
        limit = totalPriceLimit;
    }
    // Constructor with two parameters — builds a basket from saved data
    public Basket(String items, int totalPrice) {
        this();                    // calls the no-parameter constructor first
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, int price) {
        if (limit > 0 && totalPrice + price > limit) {
            System.out.println("Cannot add " + name + " — exceeds the limit of " + limit);
            return;
        }
        items = items + "\n" + name + " -- " + price;
        totalPrice = totalPrice + price;
    }
    public void print(String title) {
        System.out.println(title);
        System.out.println(items);
        System.out.println("Total: " + totalPrice);
    }
}