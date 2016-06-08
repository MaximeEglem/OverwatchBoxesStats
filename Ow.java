package com.overwatch.stats;

import java.util.ArrayList;
import java.util.List;

class Ow {

    
    public static void main(String[] args) {
        
    }

    private static void spendGoldForItem(){}
      
}

enum Rarities {
    
}

class HeroeItems {
}

enum Rarities {
    COMMUN("commun", "white"), RARE("rare", "blue"), EPIC("epic", "purple"), LEGENDARY(
            "legendary", "orange");

    private int    index;
    private String rarity = "";
    private String color  = "";

    Rarities(String rarity, String color) {
        this.rarity = rarity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return rarity;
    }
}

class Bastion extends HeroeItems {

    Bastion() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class DVa extends HeroeItems {

    DVa() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Genji extends HeroeItems {

    Genji() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Hanzo extends HeroeItems {

    Hanzo() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Junkrat extends HeroeItems {

    Junkrat() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Lucio extends HeroeItems {

    Lucio() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class McCree extends HeroeItems {

    McCree() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Mei extends HeroeItems {

    Mei() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Mercy extends HeroeItems {

    Mercy() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Pharah extends HeroeItems {

    Pharah() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Reaper extends HeroeItems {

    Reaper() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Reinhardt extends HeroeItems {

    Reinhardt() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Roadhog extends HeroeItems {

    Roadhog() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Soldier76 extends HeroeItems {

    Soldier76() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Symmetra extends HeroeItems {

    Symmetra() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Torbjorn extends HeroeItems {

    Torbjorn() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Tracer extends HeroeItems {

    Tracer() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Widowmaker extends HeroeItems {

    Widowmaker() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Winston extends HeroeItems {

    Winston() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Zarya extends HeroeItems {

    Zarya() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Zenyatta extends HeroeItems {

    Zenyatta() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class CommunItems extends Items {

    CommunItems(int numberItems) {
        super(Rarities.COMMUN.toString(), 75, numberItems, 58.66);
    }
}

class RareItems extends Items {

    RareItems(int numberItems) {
        super(Rarities.RARE.toString(), 75, numberItems, 31.69);
    }
}

class EpicItems extends Items {

    EpicItems(int numberItems) {
        super(Rarities.EPIC.toString(), 250, numberItems, 7.22);
    }
}

class LegendaryItems extends Items {

    LegendaryItems(int numberItems) {
        super(Rarities.LEGENDARY.toString(), 1000, numberItems, 2.43);
    }
}

class Items {

    private String type;
    private int    price;
    private int    number;
    private double pourcentage;

    Items(String type, int price, int number, double pourcentage) {
        this.type = type;
        this.price = price;
        this.number = number;
        this.pourcentage = pourcentage;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number
     *            the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the pourcentage
     */
    public double getPourcentage() {
        return pourcentage;
    }

    /**
     * @param pourcentage
     *            the pourcentage to set
     */
    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

}

class Heroes {

   
    Heroes() {
    }


}
