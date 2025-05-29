/*
123
456
789


741
852
963

345
456

43
54
65
*/

import java.util.Arrays;
public class RotateImage{

	public static int[][] rotateImageBy90(int[][] matrix){

		int[][] rotatedArray = new int[matrix[0].length][matrix.length];
		int rotIndex = 0;
		int matrixIndex = matrix.length - 1;

		for(int index = 0; index < rotatedArray.length; index++){

//index controls the length of each of the arrays in rotatedArray and the length of the matrix array.

			for(int count = 0; count < rotatedArray[index].length; count++){

//count moves through the index of each of the arrays in rotated Array.

				rotatedArray[rotIndex][count] = matrix[matrixIndex][index];
				if(matrixIndex > 0)matrixIndex--;				
}
			matrixIndex = matrix.length - 1;
			rotIndex++;
		
}
		return rotatedArray;
}

		public static void main(String[] args){
		
			int[][] twoDMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
			System.out.println(Arrays.deepToString(rotateImageBy90(twoDMatrix)));

}

}