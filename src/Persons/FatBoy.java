package Persons;

import Enums.*;
import Interfaces.*;

public class FatBoy extends Person implements Take, Watering, ThinkUp {
    public Items items;
    public Actions action;
    public String description;

    public FatBoy() {
        this.name = "Толстый мальчишка";
        this.description = " - школьный товарищ Малыша";
    }


    @Override
    public void takeItem() {
        this.items = Items.BAILER;
        System.out.print(" взял лейку, ");
    }

    @Override
    public void watering(){
        this.action = Actions.WATERING;
        System.out.print("и стал поливать " );
    }

    @Override
    public void thinkUp(){
        this.action = Actions.THINK;
        System.out.println(this + " придумывает дикие Шалости");
    }

}
