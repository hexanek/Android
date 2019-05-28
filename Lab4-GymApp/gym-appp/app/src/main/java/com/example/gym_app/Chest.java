package com.example.gym_app;

public class Chest {

    private String name;
    private String descriptcion;
    private int imageResourceId;


    public Chest(String name, String descriptcion, int imageResourceId) {
        this.name = name;
        this.descriptcion = descriptcion;
        this.imageResourceId = imageResourceId;
    }

    public static final Chest[] chestExercises = {
        new Chest("Wyciskanie sztangi", "Wyciskanie sztangi leżąc na płasko",R.drawable.plaska),
        new Chest("Pompki klasyczne","Pompki w klasycznym ułożeniu rąk na szerokości ramion",R.drawable.pompki)

    };

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptcion() {
        return descriptcion;
    }

    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public static Chest[] getChestExercises() {
        return chestExercises;
    }
}
