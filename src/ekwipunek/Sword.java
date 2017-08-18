package ekwipunek;

import monster.Monster;

public class Sword extends Item {
    private int tempWeight;
    private Monster monster;

    public Sword(String name) {
        super("sword", 1, 20, 5, 0);
    }

    public int swordAttack() {
        tempWeight = getFullWeight() - getItemWeight();
        setFullWeight(tempWeight);
        int i = monster.getHp() - getItemAttack();
        if (monster.getHp() == 0) {
            System.out.println("Zabiles potwora");
        }
        System.out.println("Potworkowi zostało" + i + " zycia");
        return i;
    }
}


