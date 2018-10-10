package h06;





import java.awt.*;
import java.applet.*;


public class pracktijkopdracht extends Applet {


    double a;

    double b;

    double c;
    double gemiddelde;
    public void init() {
        a= 5.9;
        b = 6.3;
        c = 6.9;
        gemiddelde  = (a + b + c)/3;
        gemiddelde = gemiddelde * 10 ;
        gemiddelde = (int) gemiddelde;
        gemiddelde = gemiddelde / 10 ;
    }

    public void paint(Graphics g) {
        g.drawString(": resultaat: " +gemiddelde , 20, 20);
    }
}