package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

       // Mebel mebel = new Mebel();

        Mebel table4 = new Table();

        Soundable mau = new Soundable();

        Sound mumu = new Sound();
        mumu.makeBoom();
        mumu.makeSound();

        Computable c = (a, b) -> a * a + b * b; // Lambda expression
        c.compute(4,5);

    }
}
