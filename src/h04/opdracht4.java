package h04;


import java.awt.*;
import java.applet.*;

public class opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.green);


        g.drawLine(50, 50, 50, 250);

        g.drawLine(50, 250, 250, 250);

        g.setColor(Color.magenta);
        g.fillRect(60, 200, 20, 50);


        g.setColor(Color.yellow);
        g.fillRect(90, 190, 20, 60);

        g.setColor(Color.orange);
        g.fillRect(120, 180, 20, 70);
    }
}

