class KladdkakaRecipe {
    Ingredient butter = new Ingredient(135, "gram", "gezouten boter");
    Ingredient cocoaPowder = new Ingredient(55, "gram", "cacaopoeder");
    Ingredient sugar = new Ingredient(350, "gram", "suiker");
    Ingredient flour = new Ingredient(110, "gram", "bloem");
    Ingredient vanilla = new Ingredient(1, "theelepel", "vanille extract");
    Ingredient egg = new Ingredient(3, "stuk(s)", "ei");

    public void printIngredients() {
        System.out.println("////////INGREDIENTEN KLADDKAKA////////");
        System.out.println(butter.getIngredients());
        System.out.println(cocoaPowder.getIngredients());
        System.out.println(sugar.getIngredients());
        System.out.println(flour.getIngredients());
        System.out.println(vanilla.getIngredients());
        System.out.println(egg.getIngredients());
        System.out.println();
    }

    public void printRecipe() {
        System.out.println("////////RECEPT KLADDKAKA////////");
        print1PrepareOvenAndForm();
        print2PrepareButter();
        print3PrepareMixture();
        print4Bake();
        print5CoolDown();
        print6Enjoy();
        System.out.println();
    }

    public void print1PrepareOvenAndForm() {
        System.out.println("Verwarm de oven voor op 180 graden Celsius. Bekleed de bodem van een springvorm met bakpapier en vet het papier en de zijkanten in met boter.");
    }

    public void print2PrepareButter() {
        System.out.println("Smelt de boter en zet deze opzij.");
    }

    public void print3PrepareMixture() {
        System.out.println("Voeg de cacaopoeder, suiker, bloem en vanille extract bij de gesmolten boter en mix lichtjes. Voeg dan de eieren toe en mix totdat een glad geheel ontstaat.");
    }

    public void print4Bake() {
        System.out.println("Giet het mengsel in de springvorm en bak 20 tot 25 minuten totdat de bovenkant vast is maar de binnenkant nog 'gooey'.");
    }

    public void print5CoolDown() {
        System.out.println("Laat de taart afkoelen in de vorm. Snij de taart los van de springvorm met een mes en bestrooi met poedersuiker.");
    }

    public void print6Enjoy() {
        System.out.println("Smaklig måltid!");
    }
}
