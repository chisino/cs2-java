// Name: Artiom Dolghi

public class SuRoboKitchen {

	public static void main(String[] args) {
		Ingredient peppers = new Ingredient("black pepper", 1, "oz");
		Ingredient garlic = new Ingredient("garlic", 2, "clove", "minced");
		Ingredient potato = new Ingredient("potato", 4, "pounds");
		
		IngredientMix mix = new IngredientMix();
		
		mix.addIngredient(peppers);
		mix.addIngredient(garlic);
		
		mix.addIngredient(potato);
		
		System.out.println(mix);
		
	}

}
