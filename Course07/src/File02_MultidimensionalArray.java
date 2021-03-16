import java.util.Random;

public class File02_MultidimensionalArray {
	static Random r = new Random();
	// 60 ~ 100 사이의 랜덤한 값을 반환하는 기능
	public static int randomNumber() {
		// r.nextInt(범위) + 최소값;
		return r.nextInt(201) - 100;
	}
	public static void main(String[] args) {
		
		// 다차원 배열의 출력
		int arr[][] = new int[3][5];
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
		
//		arr[1][0] = 6;
//		arr[1][1] = 7;
//		arr[1][2] = 8;
//		arr[1][3] = 9;
//		arr[1][4] = 10;
		
//		arr[2][0] = 11;
//		arr[2][1] = 12;
//		arr[2][2] = 13;
//		arr[2][3] = 14;
//		arr[2][4] = 15;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; i < arr[i].length; j++) {
				arr[i][j] = randomNumber();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] +  "\t");
			}
			System.out.println();
		}
		
	}

}
