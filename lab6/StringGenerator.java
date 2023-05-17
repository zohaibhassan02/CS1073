/**
 This is a class that represents a String Generator that generates acronyms and passwords.
 @author Zohaib Khan 3704572
*/

import java.util.Scanner;

public class StringGenerator {
		
	public static String generateAcronym(String text){
		
		Scanner sc = new Scanner (text);
		
		String output = "";
		
		while (sc.hasNext()){
			String token = sc.next();
			
			char c = token.charAt(0);
			
			if (Character.isUpperCase(c)){
				output = output + c;
			}
			else if (Character.isDigit(c)){
				output = output + token;
	
			}
		}
		return output;
	}
	
	public static String generatePassword(String text){
		
		Scanner sc = new Scanner (text);
		
		String pw1 = "";
		String pw2 = "";
		int counter = 0;
		
		while(sc.hasNext()){
			String token = sc.next();
	
			if (token.length() >= 3){
				counter++;
				
				if (counter%2 == 0){
					String evenWord = token.toUpperCase();
				
					for (int i=0; i<2; i++){
						char c1 = evenWord.charAt(i);
						pw1 = pw1 + c1;
					}
				}
				else {
					String oddWord = token.toLowerCase();
					for (int j= oddWord.length()-2;
							j < oddWord.length();j++){ 
						char c2 = oddWord.charAt(j);
						pw1 = pw1 + c2;
						
					}
				}
				for (int k=0; k< pw1.length(); k++){
					char c3 = pw1.charAt(k);
					char c4;
					boolean hasExceptions = false;
					
					if (c3 == 'B'){
						c4 = '3';
						pw2 = pw1.substring(0,k)
									+ c4 
									+ pw1.substring(k+1);
						hasExceptions = true;
					}
					else if (c3 == 'H'){
						c4 = '#';
						pw2 = pw1.substring(0,k)
									+ c4 
									+ pw1.substring(k+1);
						hasExceptions = true;
					}
					else if (c3 == 'a'){
						c4 = '@';
						pw2 = pw1.substring(0,k)
									+ c4 
									+ pw1.substring(k+1);
						hasExceptions = true;
					}
					else if (c3 == 't'){
						c4 = '+';
						pw2 = pw1.substring(0,k)
									+ c4 
									+ pw1.substring(k+1);
						hasExceptions = true;
					}
					
					if (hasExceptions){
						pw1 = pw2;
					}
					else {
						pw2 = pw1;
					}
					
				}
			}
		}
		return pw2;
	}
	
	public static String generateAnagram (String word1, String word2){
		

            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            int counter = 0;

            if (word1.length() == word2.length()){
            
                for (int i=0; i<word1.length(); i++){
                
                    boolean isAnagram = false;
                    
                    for (int j=0; j<word2.length() && !(isAnagram); j++){
                        if(word1.charAt(i) == word2.charAt(j)){
                            counter++;
                            isAnagram = true;
                            word2 = word2.substring(0, j) + word2.substring(j+1);
                        }
                    }
                }
            }
            
            if(counter == word1.length()){
                return "Is anagram";
            }
            else{
                return "Not anagram";
            }

	
	}
}