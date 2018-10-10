package h06;


import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    int maxInt;
int mxx;
int mm;
int mmm;

@Override
    public void init() {
        maxInt = 2147483647;

        mxx=2147483647;
        mm=2222;
        mmm=333;
    }


    @Override
    public void paint(Graphics g) {



        g.drawString(" maxInt" + (maxInt + 2), 50, 30);


        g.drawString(" mxx" + (maxInt + 2), 50, 50);
        g.drawString(" mm" +maxInt, 50, 70);

        g.drawString(" mmm" + maxInt ,50, 90);
    }
}
