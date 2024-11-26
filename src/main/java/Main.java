import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        Map map = new Map();
        frame.add(map);
        frame.setVisible(true);
        while (frame.isVisible()) { //this code for the map
            try{Thread.sleep(1000);}
            catch(Exception e){System.out.println(e);}
            map.repaint();
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.setVisible(false);
                    frame.dispose();
                }
            });
        }


        Distance dist = new Distance(); //this code for the warnings
        dist.setBoolean(false);
    };
}