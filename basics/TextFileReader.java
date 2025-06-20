package com.gss.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileReader {
	
	public static void main(String[] args) {
		String fileData="C:\\Users\\raviteja.badagala\\Desktop\\eclipse-workspace\\Random.txt";
		try {
			String mostRepeatedWord=findingRepeatedWord(fileData);
			
			System.out.println("The most repeated word in the text file is :"+ mostRepeatedWord);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static String findingRepeatedWord(String fileData) throws IOException {
		Map<String,Integer> wordData=new HashMap<String,Integer>();
		String resulantantWord;
		
		BufferedReader value=new BufferedReader(new FileReader(fileData) );
		while((resulantantWord=value.readLine())!=null) {
			
			resulantantWord=resulantantWord.replaceAll("[^a-zA-Z0-9\\s]", "");
			
			String[] words=resulantantWord.split("\\s+");
			for (String word : words) {
				if(!word.isEmpty()) 
					
					wordData.put(word, wordData.getOrDefault(word,0) + 1);
				
				
			}
		}
		value.close();
		
		String mostRepeatedWord = null;
		int maxcount=0;
		
		for (Map.Entry<String, Integer> entryData: wordData.entrySet()) {
			if(entryData.getValue( ) > maxcount) {
				mostRepeatedWord=entryData.getKey();
				maxcount=entryData.getValue();
			}
			
		}
		
		return mostRepeatedWord;
	}

}

//Explanation

/*File Reading: The file is read using a BufferedReader and FileReader. We read each line of the file.

Normalization:

The text is converted to lowercase using toLowerCase().
Punctuation is removed using replaceAll("[^a-zA-Z0-9\\s]", ""), which keeps only alphanumeric characters and spaces.
Tokenization: The split("\\s+") method splits the line into words based on spaces.

Word Frequency Counting:

A HashMap<String, Integer> is used to store the word frequencies.
For each word, getOrDefault(word, 0) checks the current frequency and increments it by 1.
Finding the Most Frequent Word:

The program iterates through the map to find the word with the highest frequency.
*/