import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
/**
 * Noah Gallagher
 *
 * Due 9/23/20
 */

/**
 * this class is an abstract class for its inherited classes (Candy, Cookie, IceCream, Sundae classes)
 * this class also implements Comparable to compare the calories between two objects.
 */
public abstract class DessertItem implements Comparable{

    protected String name;
    protected int calories;

    /**
     * the compareTo method is used to compare the calories between two DessertItems and returns the integer value based on compared result.
     * @param d
     * @return an integer (1, 0, -1) informing us which DessertItem has more calories than the other.
     */
    public int compareTo(Object d) {

        DessertItem di = (DessertItem)d;
        int comp1 = this.getCalories();
        int comp2 = di.getCalories();
        return (comp1 < comp2 ? -1 : (comp1 == comp2? 0 : 1));
    }

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {

        this("");
    }

    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Returns name of DessertItem
     *
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns cost of DessertItem
     *
     * @return cost of DessertItem
     */
    public abstract double getCost();

    /**
     * the abstract getCalories function is used to return the value of the calories of each DessertItem
     * @return as an integer
     */
    public abstract int getCalories();

    /**
     * the max method takes in two DessertItem objects and compares the two using the compareTo method.
     * the value returned from compareTo method is then used to figure out which item has more calories and prints each statement based on the returned value.
     * @param </DessertItem> di1
     * @param </DessertItem> di2
     * @return result of compared calories as a string value
     */
    static String max(DessertItem di1, DessertItem di2) {
        int comp = di1.compareTo(di2);
        //System.out.println(max(di1, di2));

        if (comp == 1) {
            return di1.getName() + " with " + di1.getCalories() + " calories is bigger than " + di2.getName() + " with " + di2.getCalories() + " calories.";
        } else if (comp == -1) {
            return di2.getName() + " with " + di2.getCalories() + " calories is bigger than " + di1.getName() + " with " + di1.getCalories() + " calories.";
        } else {
            return di1.getName() + " with " + di1.getCalories() + " calories is equal to " + di2.getName() + " with " + di2.getCalories() + " calories.";
        }
    }

    //public abstract void setCalories();
}
