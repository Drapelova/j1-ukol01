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

 nakresliSlunicko();
  }


    /*zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.penDown();

    nakresliCtverecek();
  }
 /* public void nakresliCtverecek() {
        for (int i = 0; i < 4; i++) {
          zofka.move(100);
          zofka.turnRight(90);

  */
    public void nakresliObdelnik() {

    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(150);

  }

  public void nakresliTrojuhelnik() {
    zofka.turnRight(120);
    zofka.move(150);
    zofka.turnRight(120);
    zofka.move(150);
    zofka.turnRight(120);
    zofka.move(150);
    }

    public void nakresliNozicky() {
    zofka.turnRight(60);
    zofka.move(80);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(80);
    zofka.penDown();
      zofka.turnRight(60);
      zofka.move(80);
      zofka.turnLeft(180);
      zofka.move(80);
    }

      public void nakresliPrasatko() {
        nakresliObdelnik();
        nakresliTrojuhelnik();
        nakresliNozicky();
        zofka.turnRight(150);
        zofka.move(200);
        zofka.turnRight(90);
        nakresliNozicky();
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
    }







