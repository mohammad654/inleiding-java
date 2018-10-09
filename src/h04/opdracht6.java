package h04;

import java.awt.*;
import java.applet.*;

public class opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);



        g.fillRect(100,60,40,100);


        g.fillRect(110,120,20,200);

        g.setColor(Color.red);


        g.drawOval(110,70,20,20);


        g.setColor(Color.orange);

        g.drawOval(110,100,20,20);

        g.setColor(Color.green);


        g.drawOval(110,130,20,20);




    }}