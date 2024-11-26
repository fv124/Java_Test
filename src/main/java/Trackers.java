import java.awt.*;
import java.io.IOException;

public abstract class Trackers extends LocationSystem implements Drawable {
    protected String name;
    protected int id;
    protected int ref;

    public Trackers(String name, int id, int ref) {
        this.name = name;
        this.id = id;
        this.ref = ref;
    }


    public Point get_loc(){
        try{
            return getCoords(id);
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
            return null;
        }
        catch(IOException e){
            System.out.println("IO Exception");
            return null;
        }
    };

    @Override
    public abstract void Draw(Graphics graphics);


}
