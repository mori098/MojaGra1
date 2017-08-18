package character;


public class Fighter extends Character {


    public Fighter(String nick) {
        super(nick, 150, 40, 80, 80, 0, 0, 200);
    }

    public double superAttack(){
        return (2*getAttack());
    }
    public double useShield(){
        return getDefensive()+(0.5*getDefensive());
    }


}

