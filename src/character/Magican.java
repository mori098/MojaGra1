package character;

public class Magican extends Character implements MagicPower{


        public Magican(String nick) {
                super(nick, 120, 150, 60, 40, 0, 0, 200);
        }

        public double normalAttack(){
        return (getAttack()-0.2*getAttack());
        }

public double cureMe(){
        return (getHp()+0.3*getHp());
        }

@Override
public double useFireball() {
        return (getAttack()+0.4*getAttack());
        }




        }