package ekwipunek;
import character.Character;


public class ManaPotion extends Item {
    Character character;
    private int tempWeight;
    public ManaPotion() {

        super("manaPotion", 1, 0, 0, 40);
    }

    public void addMana(){
        character.setMana(character.getMana()+getItemMana());
        tempWeight = getFullWeight()-getItemWeight();
        setFullWeight(tempWeight);
        isFullStack();
    }
}
