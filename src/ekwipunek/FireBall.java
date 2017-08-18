package ekwipunek;

import monster.Monster;

public class FireBall extends Item {
    private int tempWeight;
    private Monster monster;

    public FireBall() {
        super("FireBall", 1, 20,0,20);
    }

    public int fireballAttack(){
        tempWeight = getFullWeight()-getItemWeight();
        setFullWeight(tempWeight);
        int i = monster.getHp() - getItemAttack();
        if(monster.getHp() == 0){
            System.out.println("Zabiles potwora");
        }
        System.out.println("Potworkowi zostało" +i+ " zycia");
        return i;
    }

}
