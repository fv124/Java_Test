import java.awt.*;

public class Lion extends Trackers{
    private int age;
    private int ref;

    public Lion(String name, int age, int id){
        super(name, id, 1);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void Draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.get_loc().x, this.get_loc().y, 3,3);
        g.drawString(name, this.get_loc().x, this.get_loc().y);
    }
}
