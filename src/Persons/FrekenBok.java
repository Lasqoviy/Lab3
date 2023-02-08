package Persons;

import Enums.*;
import Interfaces.*;

public class FrekenBok extends Person implements Clean, Lead, Explain, Help, Speak {
    public Actions action;
    public Items item;

    public FrekenBok(){
        this.name = "Фрекен Бок";
        this.item = Items.TOWEL;
    }

    @Override
    public void help(){
        this.action = Actions.HELP;
        System.out.print(this.name + " занялась тем временем ");
    }

    @Override
    public void clean(){
        this.action = Actions.CLEAN;
        System.out.print(this.name + " насухо вытерла полотенцем ");
    }

    @Override
    public void lead(Object object){
        this.action = Actions.LEAD;
        System.out.println(this + " повела " + object + " в его комнату");
    }

    @Override
    public void speak(){
        this.action = Actions.SPEAK;
        System.out.println("Доносился голос " + this);
    }

    @Override
    public void explain(Object object){
        this.action = Actions.EXPLAIN;
        System.out.print(this.name + " объясняла " + object + ", что ");
    }
}
