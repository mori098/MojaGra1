package character;


import ekwipunek.Item;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String nick;
    private double hp;
    private int mana;
    private int defensive;
    private double attack;
//zastanowic sie czy tych rzeczy nie przeniesc do playera, i dziediczyc z niego te cechy ktore by byly tylko dla niego. Wtedy lekka zmiana
    private int experience;
    private int lvl;
    private int getExperienceToNextlvl = 200;

    private List<Item> eqList = new ArrayList<>();//lista ekwipunku




    public Character(String nick, double hp, int mana, int defensive, double attack, int experience, int lvl, int getExperienceToNextlvl) {
        this.nick = nick;
        this.hp = hp;
        this.mana = mana;
        this.defensive = defensive;
        this.attack = attack;
        this.experience = experience;
        this.lvl = lvl;
        this.getExperienceToNextlvl = getExperienceToNextlvl;


    }

    public int sumEq(Item item){// zsumować ciezar itemow z eq
        return item.getItemWeight();
    }

    public boolean addToEq(Item item){
        if(item.getTempWeight() + item.getFullWeight() > item.getFullWeight());
        return false;




    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDefensive() {
        return defensive;
    }

    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int experience) {
        this.experience += experience;

    }
    public void showList(){ // petla po liscie
        for (Item i : eqList) {
            System.out.println(i);
        }
    }

    public int getLvl() {
        return lvl;
    }



    public void checkIfUpperLevel(){
        if(this.experience> getExperienceToNextlvl){
            lvl++;
            experience = 0;
            System.out.println("Podskoczyles o jedne level");

        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (Double.compare(character.hp, hp) != 0) return false;
        if (mana != character.mana) return false;
        if (defensive != character.defensive) return false;
        if (Double.compare(character.attack, attack) != 0) return false;
        if (experience != character.experience) return false;
        if (lvl != character.lvl) return false;
        if (getExperienceToNextlvl != character.getExperienceToNextlvl) return false;
        return nick != null ? nick.equals(character.nick) : character.nick == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nick != null ? nick.hashCode() : 0;
        temp = Double.doubleToLongBits(hp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + mana;
        result = 31 * result + defensive;
        temp = Double.doubleToLongBits(attack);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + experience;
        result = 31 * result + lvl;
        result = 31 * result + getExperienceToNextlvl;
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "nick='" + nick + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", defensive=" + defensive +
                ", attack=" + attack +
                ", experience=" + experience +
                ", lvl=" + lvl +
                ", getExperienceToNextlvl=" + getExperienceToNextlvl +
                '}';
    }
}




