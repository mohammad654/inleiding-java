package h04;

import java.awt.*;
import java.applet.*;

public class opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);


g.drawLine(40,120,120,120);
        g.drawLine(120,120,120,200);
        g.drawLine(120,200,40,200);
        g.drawLine(40,200,40,120);




        g.setColor(Color.black);
        g.fillOval(50,130,20,20);


        g.fillOval(50,170,20,20);
        g.fillOval(90,170,20,20);
        g.fillOval(90,130,20,20);
    }}