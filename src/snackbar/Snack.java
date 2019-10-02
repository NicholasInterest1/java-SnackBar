package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;

    private String name;
    private int qty;
    private double cost;
    private int vendorId;

    public Snack(String name, int qty, double cost, int vendorId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void addToQty(int qty) {
        this.qty = this.qty + qty;
    }

    public void purchaseSnack(int qty) {
        this.qty = this.qty - qty;
    }

    public double getTotalCost(int qty) {
        return cost * qty;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

}