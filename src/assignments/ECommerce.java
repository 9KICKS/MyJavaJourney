package assignments;

public class ECommerce {
    private String purchasedItem;
    private int numberOfItems;
    private double itemPrice;

    public double getTotal() {
        return total;
    }

    public  double getSubTotal() {
        return  subTotal;
    }

    public double getCustomerDiscount() {
        return customerDiscount;
    }

    private double total;
    private double subTotal;
    private double customerDiscount;
    public ECommerce(String purchasedItem, int numberOfItems, double itemPrice, double total, double subTotal, double customerDiscount) {
        this.purchasedItem = purchasedItem;
        this.numberOfItems = numberOfItems;
        this.itemPrice = itemPrice;
        this.total = total;
        this.subTotal = subTotal;
    }

    public String getPurchasedItem() {
        return purchasedItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
