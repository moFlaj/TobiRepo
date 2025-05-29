import java.util.Arrays;
public class FactorsOfNumber{

	public static int[] factorsOfNumber(int number){
		int counter = 0;
		int[] factorsArray = new int[1];

		for(int count = 1; count <= number; count++){

			if(number % count == 0){
				++counter;
				factorsArray = new int[counter];
}
}	
		counter = 0;

		for(int count = 0; count <= number; count++){
			
			if(count > 0 && number % count == 0){
				factorsArray[counter] = count;
				counter++;

}
}
		return factorsArray;
}

	public static void main(String[] args){
		int number = 24;
		System.out.println(Arrays.toString(factorsOfNumber(number)));

}

}