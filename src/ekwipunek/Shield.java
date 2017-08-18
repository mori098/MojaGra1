package ekwipunek;
import character.Character;

public class Shield extends Item{
    Character character;

    public Shield() {
        super("tarcza", 2, 0, 30, 0);
    }

    public void useShield(){
        character.setDefensive(character.getDefensive()+getItemDeffense());
        isFullStack();
    }
}
