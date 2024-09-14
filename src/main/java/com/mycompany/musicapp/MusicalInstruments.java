package com.mycompany.musicapp;

/**
 *
 * @author zemor
 */
public class MusicalInstruments { // музыкальные инструменты

    private String name;
    private int count;
    private int date;

    public MusicalInstruments(String name, int count, int date) {
        this.name = name;
        this.count = count;
        this.date = date;
    }

    public MusicalInstruments() {
        name = null;
        count = 0;
        date = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    // наличие продукта 
    public void availabilityProduct(boolean b) {

    }

}
