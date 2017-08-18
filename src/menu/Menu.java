package menu;

import character.Elf;
import character.Fighter;
import character.Magican;
import player.Player;
import character.Fighter;

import java.util.Scanner;

public class Menu {
    private Player player;


    Scanner scanner;

    public Menu() {
        System.out.println("Witaj w grze!");
        System.out.println("Powiedz kim chcesz byc: ");
        System.out.println("Masz trzy opcje: ");
        System.out.println("1 - Warrior");
        System.out.println("2 - Elf");
        System.out.println("3 - Magus");

        String user = scanner.nextLine();
        player = new Player();
        System.out.println("Podaj nick pod jakim chcesz grac: ");

        if (user.equals("1")) {
            Fighter yourCharacter = new Fighter(scanner.nextLine());
        } else if (user.equals("2")) {
            Elf yourCharacter = new Elf(scanner.nextLine());
        } else if (user.equals("3")) {
            Magican yourCharacter = new Magican(scanner.nextLine());
        }
        printMenu();
    }


    public void printMenu() {

        String userResponse;
        do {
            System.out.println("Witaj w menu! Co chcesz zrobić?");
            System.out.println("1 - wejdź do gry");
            System.out.println("2 - idź do sklepu");
            System.out.println("3 - pokaz swoje aktualne statsy");
            System.out.println("4 - zapisz aktualny stan gry");
            System.out.println("5 - wczytaj ostatni stan gry");
            System.out.println("0 - wyjscie");
            System.out.println("Twoj wybor: ");

            userResponse = scanner.nextLine();

            switch (userResponse) {
                case "1":
                    Mapa map = new Mapa();
                    map.helloInGame();

                case "2":
                    Sklep shop = new Sklep();
                    shop.visitShop();

                case "3":
                case "4":
                case "5":
                case "0":
            }


        } while (Integer.parseInt(userResponse) == 0);
        System.out.println("dzieki za gre");
    }


    public static void main(String[] args) {

    }
}