
public class OccurrenceOfCharacter{

	public static int countOccurrenceOfCharacter(String word, char letter){

		String convertWordToLower = word.toLowerCase();
		int countOccurrence = 0;

		for(int count = 0; count < convertWordToLower.length(); count++){

			if(letter == convertWordToLower.charAt(count))countOccurrence++;

}

		return countOccurrence;
}

	public static void main(String[] args){

		System.out.println(countOccurrenceOfCharacter("Hello", 'b'));

}

}