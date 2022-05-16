//Name : Smit Narendrakumar Patel

package Items;

public class Items {
    public static void shipmentCost(int Lap, int Mouse, int Desktop, int LcdScreen) {
        double LaptopWeight = 6.5 * Lap;
        double MouseWeight = (200 * Mouse) / 1000;
        double DesktopWeight = 20 * Desktop;
        double LcdScreenWeight = 2.6 * LcdScreen;
        double TotalWeight = (double) (LaptopWeight + MouseWeight + DesktopWeight + LcdScreenWeight);
        System.out.println("Your Total Weight is: " + TotalWeight + " kg.");



        double LaptopVolume = ((60 * 50 * 50) * Lap)/1000000;
        double MouseVolume = ((30 * 30 * 20) * Mouse)/1000000;
        double DesktopVolume = ((100 * 150 * 50) * Desktop)/1000000;
        double LcdScreenVolume = ((120 * 140 * 80) * LcdScreen)/1000000;
        double TotalVolume = (double) (LaptopVolume + MouseVolume + DesktopVolume + LcdScreenVolume);
        System.out.println("Your Total volume is: " + TotalVolume + " m3.");

        if (TotalWeight <=500 && TotalVolume <= 38.0){
            System.out.println("you need 1 small container and it costs around 500 euros.");
        }
        else if (TotalWeight >= 500 && TotalVolume <= 38.0){
            System.out.println("you need 1 small container and it costs around 1200 euros.");
        }
        else if (TotalWeight <= 500 && TotalVolume >= 38.0 ){
            System.out.println("you need 2 small container and it costs around 1000 euros.");
        }
        else if (TotalWeight >= 500 && TotalVolume >= 38.0){
            System.out.println("you need big containers and it costs you around 1200 euros/container.");
        }
    }
}
