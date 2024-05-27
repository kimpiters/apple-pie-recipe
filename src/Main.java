class Main {
    public static void main(String[] args) {

        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        KladdkakaRecipe kladdkakaRecipe = new KladdkakaRecipe();

        applePieRecipe.printIngredients();
        applePieRecipe.printRecipe();

        System.out.println("--------------------------------------------------");
        System.out.println();

        kladdkakaRecipe.printIngredients();
        kladdkakaRecipe.printRecipe();
    }
}