package h07;


import java.awt.*;
import java.applet.*;

public class bijvoorbeeld extends Applet {

    public void init() {
        setSize(350, 350);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString(" welkom Mohammad !!", 60, 60);


    }
}