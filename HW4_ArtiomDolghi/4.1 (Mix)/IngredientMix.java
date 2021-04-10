// Name: Artiom Dolghi

import java.util.ArrayList;

public class IngredientMix {
	
	Ingredient i;
	Ingredient j;
	
	// ArrayList
	private ArrayList<Ingredient> mixedIngredients = new ArrayList<Ingredient>();
	
	// Blank Constructor
	 public IngredientMix() {
		Ingredient carrot = new Ingredient("carrot", 1, "cup");
		Ingredient chicken = new Ingredient("chicken", 3, "slices");
		i = carrot;
		j = chicken;
		
		addMix(this);
	}
	
	// Constructor with Ingredient
	public IngredientMix(Ingredient i) {
		addIngredient(i);
	}
	
	public IngredientMix(Ingredient newI, Ingredient newJ) {
		i = newI;
		j = newJ;
		
		addMix(this);
	}
	
	// Getter
	public Ingredient getMix(int i) { return mixedIngredients.get(i); }
	
	// Methods
	public void addIngredient(final Ingredient i) {
		mixedIngredients.add(i);
	}
	
	public void addMix(final IngredientMix mix) {
		mixedIngredients.add(mix.i);
		mixedIngredients.add(mix.j);
	}
	
	//Overridden methods
	public String toString() { 
		String str = "";
		int i = 0;
		while (i < mixedIngredients.size()) {
			str += getMix(i).getName() + "," + getMix(i).getState() + "," + getMix(i).getAmount() + "," + getMix(i).getUnit() + "\n";
			i++;
		}
		return str;
	}
	
}
