import java.awt.*;

public class Keeper extends Trackers{
    private int number;

    public Keeper(String name, int number, int id) {
        super(name, id, 0);
        this.number = number;
    }

    public int getnumber() {
        return number;
    }

    public void Draw(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(this.get_loc().x, this.get_loc().y, 2,2);
        g.drawString(name, this.get_loc().x, this.get_loc().y);
    }

}
