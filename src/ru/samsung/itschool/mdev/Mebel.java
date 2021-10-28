package ru.samsung.itschool.mdev;

public abstract class Mebel {
    protected String name;
    protected int legs;

    abstract void doMove(); // метод без реализации

    public Mebel(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public Mebel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
