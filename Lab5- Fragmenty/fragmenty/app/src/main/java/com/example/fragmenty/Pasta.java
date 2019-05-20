package com.example.fragmenty;



public class Pasta extends Food {

    public Pasta(String name, String description, Float price, int imageResourceId) {
        super(name, description, price, imageResourceId);
    }

    public static final Pasta[] PASTAS = {
            new Pasta("Spaghetti blognesse", "To sos mięsny pochodzący z włoskiego miasta Bolonia. Sporządza się go z wielu rodzajów mięs (tradycyjnie krojonych na bardzo drobne kawałeczki, obecnie się je miele, używa się wieprzowiny i wołowiny), zestawu warzyw (z typowej tzw. włoszczyzny, czyli marchewki, selera i pietruszki), oliwy, pomidorów i czerwonego wina.",
                    30f, R.drawable.bolognessse),
            new Pasta("Carbonara", "arbonarę sporządza się z boczku (najlepiej Pancetty), żółtek, parmezanu, sera owczego pecorino, oliwy, soli i pieprzu",
                    29.99f, R.drawable.carbonara),
            new Pasta("Tagiatelle", "klasyczny włoski makaron z rejonu Emilia-Romagna w kształcie długich, płaskich wstążek o grubości ok. 2 mm i szerokości 0,65-1 cm.",
                    19.99f, R.drawable.tagiatelle)
    };

}
