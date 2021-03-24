package com.codecool.farm.animal;

public abstract class Animal {
    protected int size;

    public Animal() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public abstract void feed();
}
