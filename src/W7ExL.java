import java.util.Scanner;

public class W7ExL {
	static Scanner sc = new Scanner(System.in);

	public static int countWordsInPhrase(String phrase){

		String phraseTrimmed = phrase.trim();
		int wordCount = 1;
		char lastCharacter = ' ';

		for (int charPos = 0; charPos < phraseTrimmed.length(); charPos++){
			char character = phraseTrimmed.charAt(charPos);
			if (character == ' ' && lastCharacter != ' '){

				wordCount++;
			}
			lastCharacter = character;
		}
		if (phraseTrimmed.length() == 0) wordCount = 0;
		return wordCount;
	}

	public static void main(String[] args){

		String userInput = sc.nextLine();

		System.out.println(countWordsInPhrase(userInput));

	}
}
