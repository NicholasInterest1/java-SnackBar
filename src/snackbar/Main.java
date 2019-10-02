package snackbar;

public class Main {
    public static void main(String[] args) {
        Customer consumer1 = new Customer("Jane", 45.25);
        Customer consumer2 = new Customer("Bob", 33.14);

        VendingMachine vendor1 = new VendingMachine("Food");
        VendingMachine vendor2 = new VendingMachine("Drink");
        VendingMachine vendor3 = new VendingMachine("Office");

        Snack snack1 = new Snack(vendor1.getId(), "Chips", 1.75, 36);
        Snack snack2 = new Snack(vendor1.getId(), "Chocolate Bar", 1.00, 36);
        Snack snack3 = new Snack(vendor1.getId(), "Pretzel", 2.00, 30);

        Snack snack4 = new Snack(vendor2.getId(), "Soda", 2.50, 24);
        Snack snack5 = new Snack(vendor2.getId(), "Water", 2.75, 20);

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
        System.out.println("Consumer 1 found Cash on Hand: " + consumer1.getFoundCash());
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