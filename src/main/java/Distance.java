import java.awt.*;
import java.util.ArrayList;

public class Distance {
    public static ArrayList<Lion> lions = new ArrayList<>(); //these lists are for making it flexible for multiple keepers and lions
    public static ArrayList<Keeper> keepers = new ArrayList<>();
    public static ArrayList<Drone> drones = new ArrayList<>();
    private boolean b = true;

    public Distance() {
        for (getBoolean()) {
            Point point1 = null;
            Point point2 = null;
            int number = 0;
            int freq = 0;
            for (Trackers tracker : Map.trackers) {
                int ref = tracker.ref;
                if (ref == 0) { //Give a value 0, 1 and 2 to indicate which tracking system, this makes code ready for mulitple keepers and lions
                    keepers.add((Keeper) tracker);
                    point1 = tracker.get_loc();
                    number = ((Keeper) tracker).getnumber();
                } else if (ref == 1) {
                    lions.add((Lion) tracker);
                    point2 = tracker.get_loc();
                } else if (ref == 2) {
                    drones.add((Drone) tracker);
                    freq = ((Drone) tracker).getFreq();
                }
            }
            try{
            double i = point1.y - point2.y;
            double j = point1.x - point2.x;
            double distance = Math.hypot(i, j);
            if (distance < 60) {
                AlertSystem.alertAKeeper(String.valueOf(number));
                AlertSystem.alertADrone(freq);
            }
        }
            catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        }
    }

    public void setBoolean(boolean b) {
        this.b = b;
    };

    public boolean getBoolean() {
        return b;
    }
}
