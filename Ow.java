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
