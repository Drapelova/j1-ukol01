package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO implementace domácího úkolu


        nakresliPrasatko();
        presunSe();
        nakresliDomecek();
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        nakresliDomecek();
        posunDoprava();
        nakresliDomecek();
        posunDoprava();
        nakresliDomecek();
        posunDoprava();
        nakresliDomecek();
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(250);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();
        zofka.penUp();
        zofka.move(600);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
        nakresliSlunicko();
        zofka.turnLeft(170);
        zofka.penUp();
        zofka.move(500);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliN();
        nakresliA();
        nakresliT();
        nakresliK();
        nakresliA();
    }



    public void nakresliObdelnik() {

        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(75);

    }

    public void posunDoprava() {
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliTrojuhelnik() {
        zofka.turnRight(120);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
    }

    public void nakresliNozicky() {
        zofka.turnRight(60);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnRight(60);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
    }

    public void nakresliPrasatko() {
        nakresliObdelnik();
        nakresliTrojuhelnik();
        nakresliNozicky();
        zofka.turnRight(150);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliNozicky();
    }

    public void nakresliStrisku() {
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
    }

    public void nakresliDomecek() {
        nakresliCtverec();
        zofka.turnLeft(60);
        nakresliStrisku();
    }


    public void nakresliSlunicko() {
        for (int i = 0; i < 7; i++) {
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(40);
            zofka.move(30);

        }
    }

    public void nakresliCtverec() {
        for (int i = 0; i < 5; i++) {
            zofka.move(75);
            zofka.turnRight(90);
        }
    }

    public void presunSe() {
        zofka.turnLeft(30);
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void nakresliN() {
        zofka.move(80);
        zofka.turnRight(135);
        zofka.move(110);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliA() {
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(60);
        zofka.move(53);
        zofka.turnLeft(60);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.penUp();
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliT() {
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliK() {
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(150);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }
}










