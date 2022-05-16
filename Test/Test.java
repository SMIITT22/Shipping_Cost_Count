//Name : Smit Narendrakumar Patel

package Test;


//import other packages and classes.
import Items.Items;
import Methods.Methods;

public class Test {
    public static void main(String[] args) {


        Items ie = new Items(); //object instantiation
        Methods co = new Methods(); //object instantiation


        //calling the methods for knowing containers volume.
        //this one is giving ud small container's volume.
        System.out.println("*** The volume of small container is: " + co.csVolume() + " m3 ***");
        // This one will give us big container's volume.
        System.out.println("*** The volume of big container is:  " + co.cbVolume() + " m3 ***");
        /* we put these methods inside of System.out.println because the return type of these
        is not void, it is int and that is the reason for that.*/


        //calling the method for knowing prices of containers and need the numbers of containers.
        ie.shipmentCost(15,13,17,18);
    }
}