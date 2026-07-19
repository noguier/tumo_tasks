//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("System of counting the amount gas");
        int fuelType = 95;
        System.out.println(fuelType);
        int amount = 50;
        double fuel92price = 4.0;
        double fuel95price = 5.3;
        double fuelPrice = 0;
        String errorMessage = "wrong fuel type, choose between 92 and 95";
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        }
        if (fuelPrice > 0) {

        } else {
            System.out.println(errorMessage);
        }
        if (amount < 1) {
            System.out.println("Not enough amount of gas chosen.");
        }
        boolean hasDiscount = false;
        if (amount > 10) {
            hasDiscount = true;
        }
        System.out.println("The price of chosen gas is " + fuelPrice);
        double totalPrice = 0;
        if (!hasDiscount) {
            totalPrice = fuelPrice * amount;
        } else {
            totalPrice = fuelPrice * amount * 0.9;
        }
        System.out.println("The total of chosen gas is " + totalPrice + " dollars");
//        System.out.println("System of counting the cost of movie tickets");
//        String ticketType = "adult";
//        System.out.println(ticketType);
//        int amount = 4;
//        double childPrice = 6.5;
//        double adultPrice = 12.0;
//        double seniorPrice = 9.0;
//        double ticketPrice = 0;
//        String errorMessage = "wrong ticket type, choose between child, adult, and senior";
//        if (ticketType.equals("child")) {
//            ticketPrice = childPrice;
//        } else if (ticketType.equals("adult")) {
//            ticketPrice = adultPrice;
//        } else if (ticketType.equals("senior")) {
//            ticketPrice = seniorPrice;
//        }
//        if (ticketPrice > 0) {
//        } else {
//            System.out.println(errorMessage);
//        }
//        if (amount < 1) {
//            System.out.println("Not enough tickets chosen.");
//        }
//        boolean hasDiscount = false;
//        if (amount > 3) {
//            hasDiscount = true;
//        }
//        System.out.println("The price of chosen ticket is " + ticketPrice);
//        double totalPrice = 0;
//        if (!hasDiscount) {
//            totalPrice = ticketPrice * amount;
//        } else {
//            totalPrice = ticketPrice * amount * 0.9;
//        }
//        System.out.println("The total for " + amount + " tickets is " + totalPrice + " dollars");

    }
}