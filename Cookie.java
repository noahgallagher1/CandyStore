import static java.lang.Math.round;
/**
 * Noah Gallagher
 * Jojo Paris
 * Tom Lee
 *
 * Due 9/23/20
 */

/**
 * This class extends DessertItem class and is used specifically for Objects categorized as "Cookie".
 */
public class Cookie extends DessertItem {
    private int number;
    private double price_per_dozen;
    private int cook_cals;

    /**
     * this constructor creates the object 'cookie' by taking in different parameters required for cookies.
     * @param name of the cookie
     * @param innumber of the cookies
     * @param inprice of the cookies by dozen
     * @param incook_cals of the cookie
     * @return nothing
     */

    public Cookie(String name, int innumber, double inprice, int incook_cals) {
        super(name);
        number = innumber;
        price_per_dozen = inprice;
        cook_cals = incook_cals;
    }

    /**
     * the getCost function returns the value of the cost of the cookies calculating based on the price per dozen and the number of cookies purchased.
     * @param /nothing
     * @return the cost of the purchased cookies as a double
     */
    public double getCost() {

        return Math.round((price_per_dozen / 12) * number *100.0)/100.0;
    }

    /**
     * this function returns the value of calories of cookies
     * @return calories of cookies as an integer
     */
    public int getCalories(){
        return cook_cals;
    }

    /**
     * this function sets the value of calories that will be later retrieved by the getCalories function.
     * @param incook_cal of cookie taken in as a parameter from other class.
     * @return nothing
     */
    public void setCalories(int incook_cal) {
        cook_cals = incook_cal;
    }

    /**
     * the toString method returns the string value of what and how many cookies are purchased, with the price per dozen and their cost, along with their calories.
     * @param /nothing
     * @return string value of the information explained in description.
     */
    public String toString() {
        return number + " " + name + "\n@ " + price_per_dozen + " per dozen" + "\t \t " + getCost()+ "\n calories: " + getCalories();
    }

}