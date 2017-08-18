package menu;

import ekwipunek.Sword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sklep {

    private Character character;
  private int response;

    public void visitShop() {

        System.out.println("Witaj w sklepie!");


        List<String> eqList = new ArrayList<>();


        do {

            System.out.println("Wybierz co chcesz kupić: ");
            System.out.println("1 - Sword");
            System.out.println("2 - Wand");
            System.out.println("3 - Dagger");
            System.out.println("4 - HP pot");
            System.out.println("0 - wychodze ze sklepu");
            response = Menu.scanner.nextInt();



            switch(response){
                case 1:{
                //     eqList.add(Sword);

                }

                case 2:
                case 3:
                case 4:

            }


        }while(response == 0);
        Menu menu = new Menu();
        menu.printMenu();

    }
}