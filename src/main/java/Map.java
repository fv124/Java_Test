import java.awt.*;
import java.util.ArrayList;

public class Map extends Canvas {
    public static ArrayList<Trackers> trackers = new ArrayList<>();

    public Map(){
        trackers.add(new Keeper("Geoff", 4392, 80));
        trackers.add(new Lion("Simba", 7, 30));
        trackers.add(new Drone("Monitor1", 128, 124));
    }

    public void paint(Graphics g){
        for (Trackers tracker : trackers) {
            tracker.Draw(g);
        }
    }
}
