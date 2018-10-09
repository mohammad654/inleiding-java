package h04;


import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);


        g.drawLine(100, 100, 100, 280);
        g.drawLine(100, 280, 280, 280);
        g.drawLine(280, 280, 280, 100);
        g.drawLine(280, 100, 100, 100);
        g.setColor(Color.white);

        g.drawLine(160, 180, 160, 280);
        g.drawLine(160, 280, 220, 280);
        g.drawLine(220, 280, 220, 180);
        g.drawLine(220, 180, 160, 180);



        g.drawLine(120, 120, 120, 160);
              g.drawLine(120, 160, 160, 160);
        g.drawLine(160, 160, 160, 120);

        g.drawLine(160, 120, 120, 120);




        g.drawLine(100, 100, 280, 100);
        g.drawLine(280, 100, 170, 10);
        g.drawLine(170, 10, 100, 100);










    }
}
