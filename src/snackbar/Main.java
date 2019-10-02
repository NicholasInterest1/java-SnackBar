package snackbar;

public class Main {
    public static void main(String[] args) {
        Customer consumer1 = new Customer("Jane", 45.25);
        Customer consumer2 = new Customer("Bob", 33.14);

        VendingMachines vendor1 = new VendingMachines("Food");
        VendingMachines vendor2 = new VendingMachines("Drink");
        VendingMachines vendor3 = new VendingMachines("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, vendor1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vendor1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vendor1.getId());

        Snack snack4 = new Snack("Soda", 24, 2.50, vendor2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vendor2.getId());

        // Question 1
        // Customer 1 buys 3 of snack 4. 
        // Print Customer 1 Cash on hand. 
        // Print quantity of snack 4.

        consumer1.purchaseSnack(snack4.getTotalCost(3));
        snack4.purchaseSnack(3);
        System.out.println("Consumer 1's Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of snack 4: " + snack4.getQty());
        System.out.println();

        // Question 2
        // Customer 1 buys 1 of snack 3.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 3.

        consumer1.purchaseSnack(snack3.getTotalCost(1));
        snack3.purchaseSnack(1);
        System.out.println("Consumer 1 Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of snack 3: " + snack3.getQty());
        System.out.println();

        // Question 3
        // Customer 2 buys 2 of snack 4.
        // Print Customer 2 Cash on Hand.
        // Print quantity of snack 4.

        consumer2.purchaseSnack(snack4.getTotalCost(2));
        snack4.purchaseSnack(2);
        System.out.println("Consumer 2 Cash on Hand: " + consumer2.getCash());
        System.out.println("Quantity of snack 4: " + snack4.getQty());
        System.out.println();

        // Question 4
        // Customer 1 finds $10.
        // Print Customer 1 Cash on Hand.
        
        consumer1.addCash(10.00);
        System.out.println("Consumer 1 found Cash on Hand: " + consumer1.getCash());
        System.out.println();

        // Question 5
        // Customer 1 buys 1 of snack 2.
        // Print Customer 1 Cash on Hand.
        // Print quantity of snack 2.

        consumer1.purchaseSnack(snack2.getTotalCost(1));
        snack2.purchaseSnack(1);
        System.out.println("Consumer 1 Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of snack 2: " + snack2.getQty());
        System.out.println();

        // Question 6
        // Add 12 more items to snack 3.
        // Print quantity of snack 3.

        snack3.addToQty(12);
        System.out.println("Quantity of snack 3: " + snack3.getQty());
        System.out.println();

        // Question 7
        // Customer 2 buys 3 of snack 3.
        // Print Customer 2 Cash on hand.
        // Print quantity of snack 3.

        consumer2.purchaseSnack(snack3.getTotalCost(3));
        snack3.purchaseSnack(3);
        System.out.println("Consumer 2 Cash on Hand: " + consumer2.getCash());
        System.out.println("Quantity of snack 3: " + snack3.getQty());
        System.out.println();
    }
}