package opdract21;

import java.applet.Applet;
import java.awt.*;

public class opdracht21 extends Applet {

    public void init() {
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}