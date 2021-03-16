
public class FIle01_MultidimensionalArray {

	public static void main(String[] args) {
		// * 다차원 배열 (MultidimensionalArray)
		//   - 지금까지 배운 배열을 1차원 배열이라고 하면
		//   - 다차원 배열은 배열들을 하나의 집합으로 한 배열이다.
		
		//  예시 ) 한 고등학교에 3개의 학년이 있고 6개의 반이 있으며 각 반마다 30명의 학생이 있다.
		//  이때 전교생이 540명이 있고 이를 관리하기 위한 배열을 만든다.
		int student[] = new int[540];
		// → 하나의 배열로 모든 학생을 다루는데 있어서 효율이 좋지 못해서 좀 더 세분화하여 나눈다.
		
		// 1학년
		int oneGradeStudent[] = new int[180];
		// 2학년
		int twoGradeStudent[] = new int[180];
		// 3학년
		int threeGradeStudent[] = new int[180];
		
		// → 각 학년마다 반 별 학생으로 나뉘기 때문에 여전히 효울이 좋다고 할 수 없다.
		
		// 1학년 1반
		int oneGradefirstClassStudent [] = new int[30];
		// 1학년 2반
		int oneGradesecondClassStudent [] = new int[30];
		// 1학년 3반
		int oneGradethirdClassStudent [] = new int[30];
		
		// → 총 18개의 배열들이 만들어지게 되고 이때 반 같은 경우는 모든 학교가 동일하지 않고
		//        같은 학교라도 반의 개수가 변동이 올 수 있기 때문에, 사용자가 다루기에 불편함이 있다.
		
		//  18개의 배열들을 공통적인 특성으로 하나의 배열로 만든다.
		int [][] oneGrade = new int[6][30];
		int [][] twoGrade = new int[6][30];
		int [][] threeGrade = new int[6][30];

	}

}
