// Name: Artiom Dolghi

class WordCounter {
	//Attributes
	private String word;
	private int count = 0;
	
	//Constructor
	public WordCounter(String word) {
		this.word = word;
		addToCounter();
	}
	
	//Methods
	public String getName() {
		return word;
	}
	
	public int getCount() {
		return count;
	}
	
	public void addToCounter() {
		count++;
	}
	
}
