package ekwipunek;

public class Item {
    private String name;
    private int itemWeight;
    private int itemAttack;
    private int itemDeffense;
    private int itemMana;
    private int fullWeight = 5;
    private int howMuchSpace;
    private int tempWeight;

    public Item(String name, int itemWeight, int itemAttack, int itemDeffense, int itemMana) {
        this.name = name;
        this.itemWeight = itemWeight;
        this.itemAttack = itemAttack;
        this.itemDeffense = itemDeffense;
        this.itemMana = itemMana;
    }

    public String getName() {
        return name;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public int getItemAttack() {
        return itemAttack;
    }

    public int getItemDeffense() {
        return itemDeffense;
    }

    public int getItemMana() {
        return itemMana;
    }

    public int getFullWeight() {
        return fullWeight;
    }

    public int getHowMuchSpace() {
        return howMuchSpace;
    }

    public void setHowMuchSpace(int howMuchSpace) {
        this.howMuchSpace = howMuchSpace;
    }
    public int getTempWeight() {
        return tempWeight;
    }

    public void isFullStack(){
        if(getTempWeight() == 0){
            System.out.println("nie masz juz miejsca w plecaku!");
        }else{
            System.out.println("Masz jeszcze " +getTempWeight()+ " miejsca");
        }

    }

    public void setFullWeight(int fullWeight) {
        this.fullWeight = fullWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (itemWeight != item.itemWeight) return false;
        if (itemAttack != item.itemAttack) return false;
        if (itemDeffense != item.itemDeffense) return false;
        if (itemMana != item.itemMana) return false;
        if (fullWeight != item.fullWeight) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + itemWeight;
        result = 31 * result + itemAttack;
        result = 31 * result + itemDeffense;
        result = 31 * result + itemMana;
        result = 31 * result + fullWeight;
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", itemWeight=" + itemWeight +
                ", itemAttack=" + itemAttack +
                ", itemDeffense=" + itemDeffense +
                ", itemMana=" + itemMana +
                '}';
    }

}
