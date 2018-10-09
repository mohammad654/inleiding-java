package h04;



import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(20, 20, 10, 300);

        g.setColor(Color.red);

        g.fillRect(30, 20, 150, 60);

        g.setColor(Color.white);
        g.fillRect(30, 80, 150, 60);

        g.setColor(Color.blue);

        g.fillRect(30, 140, 150, 60);
    }}

