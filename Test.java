/**
 * Noah Gallagher
 * Due 9/23/20
 */
import java.util.ArrayList;
/**
 * This Test Class is to Test each constructor and method
 */
public class Test {

    /**
     * this method is the main method in Test class which is used to add items to the list, as well as to create a receipt of all the items added to the arraylist
     * @param args
     * @input nothing
     * @output toString value to visualize what is being added to the list
     * @return nothing
     */
    public static void main(String[] args){
        ArrayList<DessertItem> di = new ArrayList<DessertItem>();

        //Candy Test
        DessertItem one = new Candy("Fudge (Candy)",1.5,7.25,500);
        DessertItem two = new Candy("Lolipop (Candy)",2.5,8.25,640);
        di.add(one);
        di.add(two);
        // show the result of candies added to the list
        String results = "Candy Test: ";
        for (int i=0; i<di.size(); i++){
            DessertItem test = di.get(i);
            results += "\n" + test.toString();
        }System.out.println(results);
        //clears the list
        di.clear();

        //Cookie Test
        DessertItem three = new Cookie("ChocChip (Cookie)",17,4.99,720);
        DessertItem four = new Cookie("Oatmeal (Cookie)",15,3.99,240);
        di.add(three);
        di.add(four);
        // show the result of cookies added to the list
        String results2 = "\nCookie Test: ";
        for (int i=0; i<di.size(); i++){
            DessertItem test = di.get(i);
            results2 += "\n" + test.toString();
        }System.out.println(results2);
        //clears the list
        di.clear();

        //IceCream Test
        DessertItem five = new IceCream("Vanilla (IceCream)",10.05,400);
        DessertItem six = new IceCream("Chocolate (IceCream)",9.99,500);
        di.add(five);
        di.add(six);
        // show the result of ice creams added to the list
        String results3 = "\nIceCream Test: ";
        for (int i=0; i<di.size(); i++){
            DessertItem test = di.get(i);
            results3 += "\n" + test.toString();
        }System.out.println(results3);
        //clears the list
        di.clear();

        //Sundae Test
        DessertItem seven = new Sundae("Carmel (Sundae)",7.00,600,"HotFudge (Toppings)",0.75);
        DessertItem eight = new Sundae("BananaSplit (Sundae)",6.00,540,"Strawberry (Toppings)",0.97);
        di.add(seven);
        di.add(eight);
        // show the result of sundae added to the list
        String results4 = "\nSundae Test: ";
        for (int i=0; i<di.size(); i++){
            DessertItem test = di.get(i);
            results4 += "\n" + test.toString();
        }System.out.println(results4);
        //clears the list
        di.clear();

    }
}
