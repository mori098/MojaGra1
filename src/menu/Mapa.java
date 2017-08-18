package menu;
import java.util.Random;
import java.util.Scanner;

public class Mapa {
    Scanner scanner;
    Random random = new Random();
    private int yourChoice;
    private int whatYouDo;
    private Character character;
    Menu menu = new Menu();
    private int day =0;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    int stillInGame;

    public void helloInGame() {
        System.out.println("Witaj na mapie");

        do {
            System.out.println("Zaraz sie okaze czy jest potwor na Twojej drodze");
            yourChoice = random.nextInt(2);

            if (yourChoice == 1) {

                do {
                    System.out.println("Spotkales potwora");
                    System.out.println("Powiedz co chcesz zrobić: ");

                    whatYouDo = scanner.nextInt();

                    System.out.println("1 - atak");
                    System.out.println("2 - idziesz dalej i wracasz do glownego menu");
                    //System.out.println("3 - wracasz do menu");
                    System.out.println("0 - wyjscie");

                    if (whatYouDo == 1) {

                    } else if (whatYouDo == 2) {

                        menu.printMenu();
                    } else if (whatYouDo != 1 && whatYouDo != 2) {
                        System.out.println("Podales złą liczbe");
                        whatYouDo = 0;
                    }


                } while (whatYouDo == 0);
                System.out.println("Dzieki za walke");


            }
            System.out.println("nie bylo potwora na Twojej drodze");
            System.out.println("Grasz dalej?");
            System.out.println("1 - tak");
            System.out.println("2 - nie");
            stillInGame = scanner.nextInt();
            if (stillInGame == 1)
                helloInGame();


        } while (stillInGame == 2);
        {
            System.out.println("dzieki za gre");
        }
    }
}
