import java.util.Scanner;
import java.io.File;
import java.util.Formatter;
import java.util.Objects;
public class PigLatin
{
	static String originalText;
	
	public static void main(String[] args) throws Exception {
		{



String home = System.getProperty("user.home");
			java.io.File file = new java.io.File(home + File.separator + "Desktop" + File.separator + "English Sentence.txt");
		Scanner userInput = new Scanner(file);
		originalText = userInput.nextLine();
		userInput.close();
		originalText = originalText.toLowerCase();
	
		String regex = " ";
		String [] inputDividedIntoWords = originalText.split(regex);
		
		for(int i=0;i<inputDividedIntoWords.length;i++)
			{
		
			  String firstLetter = inputDividedIntoWords[i].substring(0,1);
			
			String restOfWord = inputDividedIntoWords[i].substring(1);

			switch(firstLetter)
			{
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					
					System.out.format("%-20s %-20s\n", firstLetter + restOfWord, firstLetter.toUpperCase() + restOfWord.toUpperCase() +"AY");
					break;
				case "q":
					System.out.format("%-20s %-20s\n", firstLetter + restOfWord, restOfWord.substring(1).toUpperCase() + firstLetter.toUpperCase() + "UAY");
					break;
				default:
					System.out.format("%-20s %-20s\n", firstLetter + restOfWord, restOfWord.toUpperCase() + firstLetter.toUpperCase() + "AY");
			}
			}
		}
	 }

}



	



