package ho2;

import java.awt.*;
import java.applet.*;

public class shikhi extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("mohammad!!", 50, 60
        );
        g.drawString("shikhi", 55,70);
    }
}
