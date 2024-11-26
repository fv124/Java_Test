import java.awt.*;

public class Drone extends Trackers{
    private int freq;

    public Drone(String name, int freq, int id) {
        super(name, id, 2);
        this.freq = freq;
    }

    public int getFreq() {
        return freq;
    }

    public void Draw(Graphics g){
        g.setColor(Color.black);
        g.fillRect(this.get_loc().x, this.get_loc().y, 3,3);
        g.drawString(name, this.get_loc().x, this.get_loc().y);
    }
}
