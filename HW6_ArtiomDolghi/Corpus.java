// Name: Artiom Dolghi

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Corpus {
	
	public static void main(String[] args) throws IOException {
		
		File folder = new File("src/Plays");
		
		File[] files = folder.listFiles();
		
		ArrayList<Corpus> corpList = new ArrayList<Corpus>();
		
		for (int i = 0;i < files.length;i++) {
			FileReader reader = new FileReader(files[i]);
			Scanner scan = new Scanner(reader);
			Corpus corp = new Corpus(scan);
			corpList.add(corp);
		}

		FileWriter writer = new FileWriter("stats.csv", true);
		
		double richness = 0.0;
		String frequent = "";
		
		for (int i = 0;i < corpList.size();i++) {
			richness = corpList.get(i).getVocabularyRichness();
			frequent = corpList.get(i).getMostFrequentWord();
			writer.write(files[i].getName() + "," + richness + "," + frequent);
			writer.write(",");
		}
	
		writer.close();
	}
	
	//Attributes
	ArrayList<WordCounter> words;
	
	//Constructor
	Corpus(Scanner infile) throws IOException {
		
		words = new ArrayList<WordCounter>();
		
		String word;
		int check = 0;
		
		while(infile.hasNext()) {
			check = 0;
			word = infile.next();
			for (int i = 0;i < words.size();i++) {
				if (word == words.get(i).getName()) {
					words.get(i).addToCounter();
					check = 1;
					break;
				}
			}
			
			if (check == 0) {
				WordCounter one = new WordCounter(word);
				words.add(one);
			}
		}
	}
	
	//Methods
	public double getVocabularyRichness() {
		double total = 0.0;
		for (int i = 0;i < words.size();i++) {
			total += words.get(i).getCount();
		}
		
		double distinct = words.size();
		
		return total/distinct;
	}
	
	public String getMostFrequentWord() {		
		int max = 0;
		int i = 0;
	    for(i=0;i < words.size();i++){
	        if (words.get(i).getCount() > max){
	            max = words.get(i).getCount();
	        }
	    }
	    
	    return words.get(i - 1).getName();
	}
	
}
