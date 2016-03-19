package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 17.03.2016.
 */
public abstract class Hen implements Country
{
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я курица.";
    }
}
