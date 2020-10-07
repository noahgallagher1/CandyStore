/**
 * Noah Gallagher
 * Due 9/23/20
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * This Test Class is to Compare Max Calories between Class instances & to display a sorted and unsorted list.
 */

public class Test2{
    /**
     * this method is the main method used to create different objects of dessert items and adds them into the arraylist called 'di'
     * @param args
     * @input nothing
     * @output objects in the arraylist and the calories compared to each other
     * @return nothing
     */
    public static void main(String[] args) {

        ArrayList<DessertItem> di = new ArrayList<DessertItem>();

        DessertItem one = new Cookie("Chocolate (Cookie)", 30, 3.56, 500);
        //System.out.println(one);
        DessertItem two = new Cookie("Chocolate fudge (Cookie)", 14, 3.13, 600);

        DessertItem three = new Cookie("Mint (Cookie)", 24, 3.29, 300);

        DessertItem four = new Candy("Chocolate (Candy)", 3, 3.56, 500);
        //System.out.println(one);
        DessertItem five = new Candy("Chocolate fudge (Candy)", 4, 3.13, 600);

        DessertItem six = new Candy("Mint (Candy)", 4, 3.29, 300);

        DessertItem seven = new IceCream("Chocolate (IceCream)", 3.56, 500);
        //System.out.println(one);
        DessertItem eight = new IceCream("Chocolate Fudge (IceCream)", 3.13, 600);

        DessertItem nine = new IceCream("Mint (IceCream)", 3.29, 300);

        DessertItem ten = new Sundae("Chocolate (Sundae)", 3.50,540,"Caramel (Toppings)",4.00);

        DessertItem eleven = new Sundae("Strawberry (Sundae)", 3.50,320,"Banana (Toppings)",6.00);

        DessertItem twelve = new Sundae("Vanilla (Sundae)", 3.50,670,"Sugar (Toppings)",3.00);


        di.add(one);
        di.add(two);
        di.add(three);
        di.add(four);
        di.add(five);
        di.add(six);
        di.add(seven);
        di.add(eight);
        di.add(nine);
        di.add(ten);
        di.add(eleven);
        di.add(twelve);

        System.out.println("Max test for DessertItem Types: ");
        System.out.println(DessertItem.max(one,two));
        System.out.println(DessertItem.max(four,five));
        System.out.println(DessertItem.max(one,four));
        System.out.println(DessertItem.max(eight,nine));
        System.out.println(DessertItem.max(nine,three));
        System.out.println(DessertItem.max(eleven,twelve));
        System.out.println(DessertItem.max(ten,eight));

        //Prints UnSorted List
        String results = "";
        for (int i=0; i<di.size(); i++){
            DessertItem ab = di.get(i);
            results += "\n" + ab.toString();
        }System.out.println("\nUnSorted List:\n" + results);

        //Prints Sorted List (Sorted by Cals)
        Collections.sort(di);
        String results2 = "";
        for (int i=0; i<di.size(); i++){
            DessertItem ab = di.get(i);
            results2 += "\n" + ab.toString();
    }
        System.out.println("\nSorted List:\n" + results2);
}}
