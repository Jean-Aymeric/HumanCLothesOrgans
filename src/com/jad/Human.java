package com.jad;

import java.util.ArrayList;

public class Human {
    private ArrayList<Organ> organs;
    private ArrayList<Clothe> clothes;
    private ArrayList<Organ> grafts;

    public Human() {
        this.organs = new ArrayList<>();
        this.organs.add(new Heart());
        this.organs.add(new Lung());
        this.organs.add(new Lung());
        this.clothes = new ArrayList<>();
        this.grafts = new ArrayList<>();
    }

    @Override
    public String toString() {
        String stringToReturn = "";
        for(Organ organ : this.organs) {
            stringToReturn += organ.getName() + " - ";
        }
        for(Clothe clothe : this.clothes) {
            stringToReturn += clothe.getName() + " - ";
        }
        for(Organ organ : this.grafts) {
            stringToReturn += organ.getName() + " - ";
        }
        return stringToReturn;
    }

    public void wear(Clothe clothe) {
        this.clothes.add(clothe);
    }

    public void graft(Organ organ) {
        this.grafts.add(organ);
    }
}
