package ska_project2;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Order {
    //class variables

    private String orderID;
    private Customer orderCustomer;
    private Clerk orderClerk;
    private ArrayList<LineItem> lineItems;

    //store totals
    private double subtotal;
    private double tax;
    double total;

    //constant defining tax
    private static double TAX_RATE = 0.0825;

    private int productCount;
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    public Order(String anID) {
        lineItems = new ArrayList<LineItem>();

        orderID = anID;
        subtotal = 0;
        tax = 0;
        total = 0;
    }

    public void setOrderID(String anID) {
        orderID = anID;
    }

    public void setOrderCustomer(Customer aCustomer) {
        orderCustomer = aCustomer;
    }

    public void setOrderClerk(Clerk aClerk) {
        orderClerk = aClerk;
    }

    public void setOrderProduct(Product aProduct, int aQty) {

        productCount++;

        //TODO
        //Write the code to create a new line item
        //based on the variables aProduct and aQty that are passed
        //add that line item to the LineItems arraylist
        productCount = productCount + 1;
        LineItem lineItem = new LineItem(aProduct, aQty);
        lineItems.add(lineItem);

    }

    public String getOrderID() {
        return orderID;
    }

    public void calcSubtotal() {
        //TODO
        //Write the code to calculate the subtotal for all items
        //Loop through the lineItems arraylist
        //add up the total from each line to the subtotal variable
        for (LineItem line : lineItems) {
            subtotal += line.getJvzQuantity() * line.getJvzProduct().getPrice();
        }

    }

    public void calcTax() {
        //calculate the tax by multiplying subtotal by tax rate
        tax = subtotal * TAX_RATE;
    }

    public void calcTotal() {
        //caltulates the total by adding subtotal and tax
        total = subtotal + tax;
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String result = "";

        result += "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() + " @ " + orderClerk.getRegisterNbr() + "\n\n";

        result += "Order # " + orderID + "\n\n";

        result += "CUSTOMER INFO\n" + orderCustomer.toString() + "";

        result += "\nNUMBER OF ITEMS SOLD = " + getNumberItemsSold() + "\n\n";

        for (LineItem li : lineItems) {
            result += li.getJvzQuantity() + "  @  " + nf.format(li.getJvzProduct().getPrice()) + " = " + nf.format(li.getJvzQuantity() * li.getJvzProduct().getPrice()) + "\n";
            result += "    " + li.getJvzProduct().getDescription() + "\n\n";
        }

        result += "TOTALS\n";
        result += "Subtotal: " + nf.format(subtotal) + "\n";
        result += "Tax: " + nf.format(tax) + "\n";
        result += "Total: " + nf.format(total);

        return result;
    }

    //Returns the number of items sold
    public int getNumberItemsSold() {
        int totalQty = 0;
        for (LineItem li : lineItems) {
            totalQty += li.getJvzQuantity();
        }

        return totalQty;
    }

    public double getTotal() {
        return total;

    }

    public String getSubTotal() {
        String result = nf.format(subtotal);
        return result;
    }

    public String getTax() {
        String result = nf.format(tax);
        return result;
    }

    public Customer getCustomer() {
        return orderCustomer;
    }

    public double getLineTotal(int iLine) {
        //Select the LineItem from the ArrayList

        //Get the total for that item
        LineItem anItem = lineItems.get(iLine);
        return anItem.getJvzLineTotal();
    }

    public LineItem getLineItem(int anID) {
        return this.lineItems.get(anID);
    }

}
