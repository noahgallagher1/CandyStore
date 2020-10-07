/**
 * Noah Gallagher
 * Due 9/23/20
 */

import java.util.ArrayList;

import static java.lang.Math.round;

/**
 * this class functions as a receipt printer showing all the purchased items and prices.
 *
 */
public class Checkout {
    ArrayList<DessertItem> List;
    double taxRate;

    /**
     * the constructor for this class requires an arraylist and a tax rate to later apply to the purchased items.
     */
    public Checkout(){
        List = new ArrayList<DessertItem>();
        taxRate = 0.18;
    }

    /**
     * clear function clears all the items in the arraylist 'List', no parameter and no return value.
     */
    public void clear(){
        List.clear();
    }

    /**
     * this function adds items to the arraylist
     * @param item
     */
    public void enterItem(DessertItem item){
        List.add(item);
    }

    /**
     * this function calculates the size of the arraylist and returns the value as an integer
     * @return size of the list
     */
    public int numberOfItems(){
        return List.size();
    }

    /**
     * toString function works as a function to return the actual information the "receipt" will show to the customer
     * @param /nothing
     * @return purchased information (number of items, subtotal cost, amount of tax, and total cost)
     */
    public String toString(){
        String results = "Number of items: " + numberOfItems() + "\nTotal Cost: " + totalCost() + "\nTotal Tax: " + totalTax() + "\nCost + Tax: "+ (totalCost()+totalTax()) + "\n \tCandy Shop \n \t----------";
        for (int i=0; i<List.size(); i++){
            DessertItem abc = List.get(i);
            results += "\n" + abc.toString();

        }return results + "\nTax: " + Math.round(totalTax())/100.00 +"\nTotal Cost: " + Math.round(totalCost()+totalTax())/100.0;
    }

    /**
     * totalCost function adds all the item costs in the arraylist by using the getter method, and returns the value as an integer
     * @param /nothing
     * @return integer value of total cost before tax (subtotal).
     */
    public int totalCost() {
        int before_tax = 0;
        for (int i = 0; i < List.size(); i++) {
            DessertItem getter = List.get(i);
            int tester = (int) round(getter.getCost());
            before_tax+=tester;
        }return before_tax;
    }

    /**
     * totalTax function computes the amount of tax that will be implied to the total cost by using the taxRate variable.
     * @param /nothing
     * @return amount of tax as an integer
     */
    public int totalTax(){
        int n = 0;
        for (int i=0; i < List.size(); i++){
            DessertItem b = List.get(i);
            double x = b.getCost();
            double tax = (x*taxRate);
            int to_int = (int) round(tax);
            n+=to_int;
        }
        return n*100;
    }

    /**
     * the function sets the tax rate to the declared variable taxRate
     * @param intaxRate
     * @return nothing
     */
    public void setTaxRate(double intaxRate){
        taxRate = intaxRate;
    }

    /**
     * getTaxRate function is used to retrieve the value of the taxRate declared.
     * @param /nothing
     * @return value of the variable taxRate as a double
     */
    public double getTaxRate(){
        return taxRate;
    }

    /**
     * this method is the main method in Checkout class which is used to add items to the list, as well as to create a receipt of all the items added to the arraylist
     * @param args
     * @input nothing
     * @output receipt including all the purchased items and their prices, etc., using toString method.
     * @return nothing
     */
    public static void main(String[] args){
        Checkout test = new Checkout();
        test.List.add(new Candy("Sour (Candy)",2.30,.89,500));
        test.List.add(new Cookie("Chocolate Chip (Cookie)",17,4.99,500));
        test.List.add(new IceCream("Chocolate (IceCream)",5.99,400));
        test.List.add(new Sundae("Carmel (Sundae)",7.00,600,"HotFudge (Toppings)",0.75));
        System.out.println(test.toString());


    }







}
