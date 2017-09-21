package com.company.helloworldspring.models;

public class Cheeseburger {
    private int numPatties;
    private boolean hasPickles;
    private boolean hasMayo;
    private CheeseType cheeseType;


    public enum CheeseType {
        AMERICAN, PROVOLONE, CHEDDAR, PEPPER_JACK
    }

    public Cheeseburger(int numPatties, boolean hasPickles, boolean hasMayo, CheeseType cheeseType) {
        this.numPatties = numPatties;
        this.hasPickles = hasPickles;
        this.hasMayo = hasMayo;
        this.cheeseType = cheeseType;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isHasPickles() {
        return hasPickles;
    }

    public void setHasPickles(boolean hasPickles) {
        this.hasPickles = hasPickles;
    }

    public boolean isHasMayo() {
        return hasMayo;
    }

    public void setHasMayo(boolean hasMayo) {
        this.hasMayo = hasMayo;
    }

    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }
}
