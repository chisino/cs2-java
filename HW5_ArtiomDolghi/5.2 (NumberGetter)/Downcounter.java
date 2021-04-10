// Name: Artiom Dolghi

class Downcounter {
	int initial;
	
	public Downcounter(int initial) {
		if (initial < 0) {
			throw new RuntimeException("Value must be positive");
		}
		this.initial = initial;
	}
	
	public void downcount() {
		initial -= 1;
		if (initial == 0) {
			throw new DowncounterException("Value of counter is 0");
		}
	}
	
}
