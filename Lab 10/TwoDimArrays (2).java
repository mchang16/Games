import java.util.Scanner;

public class TwoDimArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Three = { args[0], args[1], args[2] };
		printArray(convertArgs(Three));
		input.close();
	}

	public static void printArray(int[][] origin) {
		int numCols = origin[0].length;
//		for (int col = 0; col < numCols; col++) {
//			for (int row = 0; row < origin.length; row++) {
//				System.out.format("%-10d", origin[row][col]);
//			}
//			System.out.println();
//			
//		}
		for (int row = 0; row < origin.length; row++) {
			for (int col = 0; col < numCols; col++){
				System.out.format("%-10d", origin[row][col]);
			}
			System.out.println();
			
		}
	}

	public static int[][] convertArgs(String[] Three) {
		int row2 = Three.length;
		int Compare = 0;

		//for (int b = 0; b <= row2; b++) {
			int b = 0;
			int two = (b + 1);
			int three = (b + 2);
			int CompareOne = Math.max(Three[b].length(), Three[two].length());
			Compare = Math.max(CompareOne, Three[three].length());
		//}

		int[][] Final = new int[row2][Compare];

		for (int word = 0; word < row2; word++) {
			for (int c = 0; c<Three[word].length() ; c++) {
				//for (int subIndex = 0; subIndex < Three[letter].length(); subIndex++) {
					char alpha = Three[word].charAt(c);
					int ascii = (int) alpha;
					Final[word][c] = ascii;
					if (Final[word][c] ==0){
						Final[word][c] = (-1); 
				}

			}

		}

		return Final;
	}

}
