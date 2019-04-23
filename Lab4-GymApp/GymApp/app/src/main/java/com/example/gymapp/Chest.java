package com.example.gymapp;

public class Chest {
    private String nameExercise;
    private String description;
    private int imageResourceId;

    public static final Chest[] chestExercises = {
            new Chest("Wyciskanie sztangi", "Złap sztange nachwytem mniej więcej na szerokości barków," +
                    " następnie zdejmij ją ze stojaków i opuść równym tempem do klatki piersiowej biorąc głęboki wdech. Po lekkim " +
                    " dotknięciu klatki wykonaj ruch powrotny wyciskając sztangę", R.drawable.wyciskanie_sztangi),
            new Chest("Wyciskanie hantli - skos górny","Ustaw ławkę pod kątem 20-45 stopni " +
                    " ZŁap sztangielki nachwytem, wykonaj ruch podobny do wyciskania sztangi", R.drawable.hantlegorny)
    };

    public Chest(String nameExercise, String description, int imageResourceId) {
        this.nameExercise = nameExercise;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.nameExercise;
    }
}
