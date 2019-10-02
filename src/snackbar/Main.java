package snackbar;

public class Main {
    public static void main(String[] args) {
        Customer consumer1 = new Customer("Jane", 45.25);
        Customer consumer2 = new Customer("Bob", 33.14);

        VendingMachine vendor1 = new VendingMachine("Food");
        VendingMachine vendor2 = new VendingMachine("Drink");
        VendingMachine vendor3 = new VendingMachine("Office");

        Snack morsel1 = new Snack(vendor1.getId(), "Chips", 1.75, 36);
        Snack morsel2 = new Snack(vendor1.getId(), "Chocolate Bar", 1.00, 36);
        Snack morsel3 = new Snack(vendor1.getId(), "Pretzel", 2.00, 30);

        Snack morsel4 = new Snack(vendor2.getId(), "Soda", 2.50, 24);
        Snack morsel5 = new Snack(vendor2.getId(), "Water", 2.75, 20);

        // Question 1
        // Customer 1 buys 3 of snack 4. 
        // Print Customer 1 Cash on hand. 
        // Print quantity of snack 4.

        consumer1.buyMorsel(morsel4.getFinalCost(3));
        morsel4.buyMorsel(3);
        System.out.println("Consumer 1's Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of Morsel 4: " + morsel4.getQty());
        System.out.println();

        // Question 2
        // Customer 1 buys 1 of snack 3.
        // Print Customer 1 Cash on hand.
        // Print quantity of snack 3.

        consumer1.buyMorsel(morsel3.getFinalCost(1));
        morsel3.buyMorsel(1);
        System.out.println("Consumer 1 Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of Morsel 3: " + morsel3.getQty());
        System.out.println();

        // Question 3
        // Customer 2 buys 2 of snack 4.
        // Print Customer 2 Cash on Hand.
        // Print quantity of snack 4.

        consumer2.buyMorsel(morsel4.getFinalCost(2));
        morsel4.buyMorsel(2);
        System.out.println("Consumer 2 Cash on Hand: " + consumer2.getCash());
        System.out.println("Quantity of Morsel 4: " + morsel4.getQty());
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

        consumer1.buyMorsel(morsel2.getFinalCost(1));
        morsel2.buyMorsel(1);
        System.out.println("Consumer 1 Cash on Hand: " + consumer1.getCash());
        System.out.println("Quantity of Morsel 2: " + morsel2.getQty());
        System.out.println();

        // Question 6
        // Add 12 more items to snack 3.
        // Print quantity of snack 3.

        morsel3.addToQty(12);
        System.out.println("Quantity of Morsel 3: " + morsel3.getQty());
        System.out.println();

        // Question 7
        // Customer 2 buys 3 of snack 3.
        // Print Customer 2 Cash on hand.
        // Print quantity of snack 3.

        consumer2.buyMorsel(morsel3.getFinalCost(3));
        morsel3.buyMorsel(3);
        System.out.println("Consumer 2 Cash on Hand: " + consumer2.getCash());
        System.out.println("Quantity of Morsel 3: " + morsel3.getQty());
        System.out.println();
    }
}