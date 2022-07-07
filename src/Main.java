import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int vertical; //column
		int horizontal; //row
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== MATRIX TRANSPOSE PROGRAM ===\n");
		System.out.print("Input Column: ");
		vertical = scanner.nextInt();
		System.out.print("Input Row: ");
		horizontal = scanner.nextInt();
		int[][] matrix = new int[vertical][horizontal];
		int[][] transpose = new int[horizontal][vertical];
		
		for(int i = 0; i < vertical; i++){
			for(int j = 0; j < horizontal; j++){
				System.out.print("Position ["+i+"]["+j+"]: ");
				matrix[i][j] = scanner.nextInt();
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("\nBefore Transpose :");
		for(int i = 0; i < vertical; i++){
			for(int j = 0; j < horizontal; j++){
				System.out.print("["+matrix[i][j]+"] ");
			}
			System.out.println("");
		}

		System.out.println("\nAfter Transpose :");
		for(int i = 0; i < horizontal; i++){
			for(int j = 0; j < vertical; j++){
				System.out.print("["+transpose[i][j]+"] ");
			}
			System.out.println("");
		}
	}
}
