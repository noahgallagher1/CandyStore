import static java.lang.Math.round;
/**
 * Noah Gallagher
 * Jojo Paris
 * Tom Lee
 *
 * Due 9/23/20
 */
public class Candy extends DessertItem{
    /**
     * This class extends DessertItem class and is used specifically for Objects categorized as "Candy".
     *
     */
    private double weight;
    private double price_per_pound;
    private int calories;

    public Candy(String name, double inweight, double inprice,int incalories){
        /**
         * this constructor is used to create one candy object
         * @param name of the candy, the weight of the candy, the price, and the calories.
         * @return nothing
         */
        super(name);
        weight = inweight;
        price_per_pound = inprice;
        calories = incalories;
    }
    public double getCost(){
        /**
         * this method is used to retrieve the cost of the candy based on its weight and price per pound(lb) in double type.
         * @return cost of the candy
         */
        return Math.round((weight * price_per_pound)*100.0) / 100.0;
    }
    public int getCalories(){
        /**
         * this method is used to retrieve the number of calories the specific candy has in integer type.
         * @return number of calories of the candy
         */
        return calories;
    }

    public void setCalories(int incalories){
        /**
         * this method is used to set the local value 'calories' to the input value of 'incalories'
         * @param incalories : input calories from 'Test.java' class
         * @return nothing
         */
        calories = incalories;
    }
    public String toString(){
        /**
         * this method is used to create the string that will explain the purchased item and its info.
         * @return string value explaining how much weight of candy is bought, along with its price per pound and calories.
         */
        return weight + " lbs. " + " @ " + price_per_pound + " /lb. \n" + name + "\t \t" + getCost() + "\n calories: " + getCalories();}
}
