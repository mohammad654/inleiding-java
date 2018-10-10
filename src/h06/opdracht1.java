

package h06;




import java.awt.*;
import java.applet.*;


public class opdracht1 extends Applet {
  double  bedrag;
    double gerop;
    double perpersoon;
    double uitkomst;

    public void init() {

       bedrag=113;
      gerop=4;
perpersoon=bedrag/gerop;
    }

    public void paint(Graphics g) {
        g.drawString("iedereen kijgt..."+perpersoon ,20, 20);
    }
}