package h05;







import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {


    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = Color.GRAY;
        lijnkleur = Color.green;
        breedte = 60;
        hoogte = 30;

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        // RECHTHOEK LINKSBOVEN
        g.drawRect(20, 20, 250, 250);


        g.drawLine(60, 50, 130, 50);

        g.drawString("lijn!!", 60,70    );





        g.setColor(Color.black);
        g.drawRect(70, 80,breedte,hoogte);

        g.drawString("Rechthoek!!", 70,130    );





        g.setColor(opvulkleur);

        g.fillRect(140, 80, breedte, 40);

        g.drawString("Gevulde!!", 139,130    );





        g.setColor(Color.black);
        g.drawOval(140, 80, 60, 40);
        g.drawString("!Taartpunt!", 200,130    );




        g.setColor(Color.magenta);

        g.fillArc(210, 85, 60, 30, 360, 45);

        g.drawString("!Afgronde!", 60,220    );



        g.setColor(lijnkleur);
        g.drawOval(210, 85, 60, 30);
        g.drawString("!Afgronde!", 120,220    );

        g.setColor(Color.BLACK);

        g.drawRoundRect(60, 160, 60, 40, 15, 15);

        g.setColor(lijnkleur);


        g.drawOval(210,165,50,50);
        g.drawString("!Cirkel!", 220,230    );


        g.setColor(Color.magenta);


        g.fillOval(130,165,70,40);

    }

}