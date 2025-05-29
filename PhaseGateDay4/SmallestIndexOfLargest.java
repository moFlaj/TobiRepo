public class SmallestIndexOfLargest{

	public static int returnFirstIndexOfLargest(double[] arrayElements){

		double largest = Integer.MIN_VALUE;
		int indexOfLargest = 0;

		for(int index = 0; index < arrayElements.length; index++){

			if(arrayElements[index] > largest){
				largest = arrayElements[index];		
				indexOfLargest = index;
}
}
		return indexOfLargest;
}

	public static void main(String[] args){
		double[] arrayElements = {1,5.6,3.3,4,5.9,5};
		System.out.println(returnFirstIndexOfLargest(arrayElements));

}
}