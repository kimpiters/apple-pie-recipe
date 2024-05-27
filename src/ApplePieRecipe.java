class ApplePieRecipe {
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient brownSugar = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient whiteSugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients() {
        System.out.println("////////INGREDIENTEN////////");
        System.out.println(butter.getIngredients());
        System.out.println(brownSugar.getIngredients());
        System.out.println(flour.getIngredients());
        System.out.println(egg.getIngredients());
        System.out.println(vanillaSugar.getIngredients());
        System.out.println(salt.getIngredients());
        System.out.println(apple.getIngredients());
        System.out.println(whiteSugar.getIngredients());
        System.out.println(cinnamon.getIngredients());
        System.out.println(breadcrumbs.getIngredients());
        System.out.println();
    }

    public void printRecipe() {
        System.out.println("////////RECEPT////////");
        print1PreheatOven();
        print2PrepareEgg();
        print3MixDough();
        print4PrepareApples();
        print5PrepareForm();
        print6AddDough();
        print7AddApples();
        print8PrepareDough2();
        print9AddDough2();
        print10Bake();
        System.out.println();
    }

    public void print1PreheatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void print2PrepareEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void print3MixDough() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void print4PrepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void print5PrepareForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void print6AddDough() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void print7AddApples() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void print8PrepareDough2() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void print9AddDough2() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void print10Bake() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}
