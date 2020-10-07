/**
 * Noah Gallagher
 * Due 9/23/20
 */


/**
 * This class extends DessertItem class and is used specifically for Objects categorized as "IceCream".
 */
public class IceCream extends DessertItem {
    protected double cost;
    protected int ice_cals;

    /**
     * the constructor method used to create one IceCream object.
     * the method requires three information: name of the ice cream, the cost, and the calories.
     * @param name of the ice cream
     * @param incost of the ice cream
     * @param inice_cals of the ice cream
     * @return nothing
     */
    public IceCream(String name, double incost, int inice_cals){
        super(name);
        cost = incost;
        ice_cals = inice_cals;
    }

    /**
     * the getCost method returns the cost of the ice cream as a double
     * @return cost of the ice cream
     */
    public double getCost() {
        return cost;
    }

    /**
     * getCalories method will return the amount of calories of the ice cream as an integer
     * @return calories of the ice cream
     */
    public int getCalories(){
        return ice_cals;
    }

    /**
     * setCalories method will assign the calories set in other class as a local variable "ice_cals"
     * @param inice_cal of ice cream received from other class
     * @return nothing
     */
    public void setCalories(int inice_cal) {
        ice_cals = inice_cal;
    }

    /**
     * toString method will print out the name of the ice cream, the cost, and its calories when it's called.
     * @param /nothing
     * @return string value of information of each ice cream object.
     */
    public String toString() {
        return name + "\t \t" + cost + "\n calories: " + getCalories();
    }
}
