public class Main {
    public static void main(String[] args) {

        // Uses the parameterless constructor
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80);
        vasyaBasket.add("Bread", 40);
        vasyaBasket.print("Vasya's basket:");

        // Uses the constructor with a limit
        Basket petyaBasket = new Basket(1000);
        petyaBasket.add("Shovel", 280);
        petyaBasket.add("Barrel", 2900); // exceeds limit — rejected
        petyaBasket.print("Petya's basket:");

        // Uses the constructor with two parameters (pre-filled basket)
        Basket mashaBasket = new Basket("Table", 5000);
        mashaBasket.print("Masha's basket:");
    }
}