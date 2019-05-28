package com.example.gym_app;

public class Back {
    private String name;
    private String descriptcion;
    private int imageResourceId;


    public Back(String name, String descriptcion, int imageResourceId) {
        this.name = name;
        this.descriptcion = descriptcion;
        this.imageResourceId = imageResourceId;
    }

    public static final Back[] backExercises = {
            new Back("Podciąganie na drążku", "Podciąganie na drążku do brody szerokim nachwytem",R.drawable.podciaganie),
            new Back("Wiosłowanie sztangą","Wiosłowanie sztangą od lini kolan do podbrzusza stojąc",R.drawable.wioslo)

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
