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
    int hoogteXas;
int breedteyas;

    public void init() {  //initialisatie.

        valerie = 130;
        jeroen = 100;
        hans = 80;

        opvulkleur = Color.green;
        lijnkleur = Color.yellow;
        breedte = 20;
        hoogte = 50;
        hoogteXas = 200;
        breedteyas=200-valerie;

    }

    public void paint(Graphics g) {


        g.drawLine(20, hoogteXas, 350, hoogteXas);

g.drawLine(breedte,20,breedte,200);


g.fillRect(40 ,breedteyas ,20,valerie);





g.fillRect(70,120,20,80);


g.fillRect(100,100,20,100);
}}

