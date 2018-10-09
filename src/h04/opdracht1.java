package h04;


import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 50, 150, 50);
        g.drawLine(50, 50, 100, 163);
        g.drawLine(150, 50, 100, 163);

    }
}