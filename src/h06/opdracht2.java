

package h06;




import java.awt.*;
import java.applet.*;


public class opdracht2 extends Applet {

    int minuut;
    int uur;
    int dag;
    int jaar;

    public void init() {
        minuut = 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;

    }

    public void paint(Graphics g) {
        g.drawString("seconden in minuut: "+ minuut,20, 20);
        g.drawString("seconden in uur: "+ uur,20, 40);


        g.drawString("seconden in dag: "+dag,20, 60);

        g.drawString("seconden in jaar "+ jaar,20, 80);

    }
}

