import java.util.Arrays;
public class SortArrayDescending{

	public static int[] mergeAndSortArrays(int[] numArray1, int[] numArray2){
		int modIndex = 0;
		int[] modArray = new int[numArray1.length + numArray2.length];

		for(int index = 0; index < numArray1.length; index++){
			modArray[index] = numArray1[index];
			 modIndex = index;
}
		for(int index = 0; index < numArray2.length; index++){
			modArray[modIndex] = numArray2[index];
			modIndex++;
}			
		Arrays.sort(modArray);	

		for(modIndex = 0; modIndex < modArray.length; modIndex++){
			
			for(int index = 0; index < modArray.length; index++){
				if(modArray[modIndex] > modArray[index]){
					modArray[modIndex] = modArray[modIndex] + modArray[index];
					modArray[index] = modArray[modIndex] - modArray[index];
					modArray[modIndex] = modArray[modIndex] - modArray[index];
}

			
}
}
		return modArray;
}
/*	public static void main(String[] args){
		int[] numArray1 = {9,8,3,4};
		int[] numArray2 = {2,6,2,1,4,1};

		System.out.println(Arrays.toString(mergeAndSortArrays(numArray1, numArray2)));

}*/
}