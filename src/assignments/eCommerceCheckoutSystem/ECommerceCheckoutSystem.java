package assignments.eCommerceCheckoutSystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class ECommerceCheckoutSystem {
    private static String cashierName;
    private static double discount;
    private static double subTotal;
    private static double customerDiscount;
    private static double vat;
    private static double billTotal;
    private static double customerCash;
    private static double balance;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ECommerce> list = new ArrayList<>();
        System.out.println("What is the customer's name? ");
        String customerName = input.nextLine();
        customerCheckout(list, input);
        cashierCheckout(list, input);
        System.out.println();
        receipt(list, customerName);
        System.out.println();
        System.out.println();
        secondReceipt(list, customerName);
    }

    private static void receipt(ArrayList<ECommerce> list, String customerName) {
        customerReceipt(list, customerName);
        equals();
        System.out.println("        THIS IS NOT A RECEIPT, KINDLY PAY " +billTotal);
        equals();
    }
    private static void customerReceipt(ArrayList<ECommerce> list, String customerName) {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 08050211753");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss aa");
        String currentDate = dateFormat.format(new Date());
        System.out.println(currentDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        equals();
        System.out.printf("                 ITEM      QTY      PRICE      TOTAL(NGN)%n");
        dash();
        for (int i = 0; i < list.size(); i++) {
            ECommerce eCommerce = list.get(i);
            System.out.printf("%20s %8d %12.2f %13.2f%n", eCommerce.getPurchasedItem(),eCommerce.getNumberOfItems(), eCommerce.getItemPrice(), eCommerce.getTotal());
        }
        dash();
        System.out.println("                    Sub Total:      " +subTotal);
        System.out.println("                     Discount:      " +customerDiscount);
        System.out.println("                   VAT @ 7.5%:      " +vat);
        equals();
        System.out.println("                   Bill Total:      " +billTotal);
    }
    private static void secondReceipt(ArrayList<ECommerce> list, String customerName) {
        System.out.println("How much did the customer give to you? ");
        customerCash = input.nextDouble();
        balance = customerCash - billTotal;
        customerReceipt(list, customerName);
        System.out.println("                  Amount paid:     " +customerCash);
        System.out.println("                      Balance:     " +balance);
        equals();
        System.out.println("        THANK YOU FOR YOUR PATRONAGE");
        equals();
    }
    private static void dash() {
        String dash = "-";
        System.out.println(dash.repeat(60));
    }
    private static void equals() {
        String equals = "=";
        System.out.println(equals.repeat(60));
    }
    private static void cashierCheckout(ArrayList<ECommerce> list, Scanner input) {
        while (true) {
            System.out.println("Add more items? (yes/no): ");
            String moreItems = input.nextLine();
            if (moreItems.equalsIgnoreCase("yes")) {
                customerCheckout(list, input);
            }
            else if (moreItems.equalsIgnoreCase("no")) {
                System.out.println("What is your name? ");
                cashierName = input.nextLine();
                System.out.println("How much discount will he get? ");
                discount = input.nextDouble();
                break;
            } else {
               cashierCheckout(list,input);
            }
        }
        customerDiscount = (discount/100) * subTotal;
        vat = (7.5/100) * subTotal;
        billTotal = (vat - customerDiscount) + subTotal;
    }
    private static void customerCheckout(ArrayList<ECommerce> list, Scanner input) {
        System.out.println("What did the user buy? ");
        String purchasedItem = input.nextLine();
        System.out.println("How many pieces? ");
        int numberOfItems = input.nextInt();
        System.out.println("How much per unit? ");
        double itemPrice = input.nextDouble();
        input.nextLine();
        double total = numberOfItems * itemPrice;
        subTotal += total;

        ECommerce eCommerce = new ECommerce(purchasedItem, numberOfItems, itemPrice, total, subTotal, customerDiscount);
        list.add(eCommerce);
    }
}
