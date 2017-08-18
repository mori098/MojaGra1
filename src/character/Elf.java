package character;


public class Elf extends Character implements MagicPower {
    //private double magic = 0.2*getAttack();
    private double cure = 0.2*getHp();

    public Elf(String nick) {
        super(nick, 100, 150, 50, 70, 0, 0, 200);
    }




    public double useSuperPower(){
        return getAttack()+0.5*getAttack();
    }
    public double cureMe(){
        return (getHp()+cure);
    }
    public double useFireball(){
        return (getAttack()+0.4*getAttack());
    }




}