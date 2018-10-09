package h05;





import java.awt.*;
import java.applet.*;

public class opdracht22 extends Applet {

    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    int valerie;
    int jeroen;
    int hans;


    public void init() {  //initialisatie.

        valerie = 40;
        jeroen = 100;
        hans = 80;

        opvulkleur = Color.green;
        lijnkleur = Color.yellow;
        breedte = 20;
        hoogte = 50;

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.green);




        g.drawRect(00,00,200,200);

        g.setColor(Color.blue);
        g.drawRect(20,160,breedte,valerie );


        g.setColor(Color.yellow);

        g.drawRect(60,120,breedte,hans);


        g.setColor(Color.lightGray);

        g.drawRect(100,100,breedte, jeroen);

    }}

