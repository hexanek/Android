package com.example.gym_app;

public class Legs {

    private String name;
    private String descriptcion;
    private int imageResourceId;


    public Legs(String name, String descriptcion, int imageResourceId) {
        this.name = name;
        this.descriptcion = descriptcion;
        this.imageResourceId = imageResourceId;
    }

    public static final Legs[] legsExercises = {
            new Legs("Przysiady", "Przysiad ze sztangą w szerokim rozstawie nóg",R.drawable.przysiad),
            new Legs("Wykroki","Wykroki w wąskim rozstawie nóg",R.drawable.wykroki)

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
}
