/**
 * Noah Gallagher
 * Jojo Paris
 * Tom Lee
 *
 * Due 9/23/20
 */
import static java.lang.Math.round;
/**
 * This class extends IceCream class and is used specifically for Objects categorized as "Sundae".
 */
public class Sundae extends IceCream {
    private String toppings;
    private double top_cost;

    /**
     * the constructor method used to create one Sundae object.
     * along with the parameters inherited from IceCream class, Sundae class also need values for toppings and their costs.
     * @param name of the sundae
     * @param cost of the sundae
     * @param ice_cals of the sundae
     * @param name of toppings included
     * @param cost of toppings
     * @return nothing
     */
    public Sundae(String name, double cost, int ice_cals, String intoppings, double intop_cost){
        super(name,cost,ice_cals);
        toppings = intoppings;
        top_cost = intop_cost;
    }

    /**
     * the getCost method returns the cost of the sundae as a double
     * @return cost of the sundae
     */
    public double getCost() {
        return ((cost + top_cost)*100)/100;}
    /**
     * toString method will print out the name of the sundae, the cost, its calories, as well as the toppings when it's called.
     * @param /nothing
     * @return string value of information of each sundae object.
     */
        public String toString() {
        return name + "\t \t" + getCost() + "\nwith " + toppings  + "\n calories: " + getCalories();
    }
}
