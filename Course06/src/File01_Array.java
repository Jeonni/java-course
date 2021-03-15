import java.util.Random;

public class File01_Array {

	static Random r = new Random();
	// 60 ~ 100 사이의 랜덤한 값을 반환하는 기능
	public static int randomScore() {
		return r.nextInt(41) + 60;
	}
	
	public static void main(String[] args) {
		// * 배열(Array)
		//   자료형 : 같은 사용 용도에 따라 구분하기 위한 데이터 타입
		
		// 같은 자료형 타입의 데이터들을 사용 용도 또는 목적에 따라 하나의 묶음으로 다루기 위한 구조
		//  → 배열 (Array)
		//   즉, 데이터들을 나열한 자료 구조
		// =======================================================================
		
		// 학생 5명의 점수를 저장하기 위한 변수를 선언
		int std1 = randomScore();
		int std2 = randomScore();
		int std3 = randomScore();
		int std4 = randomScore();
		int std5 = randomScore();
		
		System.out.println("std1 : " + std1);
		System.out.println("std2 : " + std2);
		System.out.println("std3 : " + std3);
		System.out.println("std4 : " + std4);
		System.out.println("std5 : " + std5);
		
		// * 평균
		double avg = (double)(std1 + std2 + std3 + std4 + std5)/5;
		
		// * 탐색
		//  2번째 학생의 점수
		//  search에 저장된 값을 1부터 5까지 조건문으로 검사해서 출력해야 한다.
		int search = 2;
		
		// * 문제점
		//  - 입/출력이 중복이 되는데도 반복문으로 처리할 수 없다.
		//  - 사용자가 원하는 만큼 입/출력을 할 수 없다.
		//  - 데이터들의 연산이 고정적이다.
		//  - 데이터의 수가 바뀌면 연산을 해줘야 한다.
		//  - 탐색을 모두 검사하면서 해야 한다.
		
		//  위의 문제를 해결하기 위한 방법 : 배열 (Array)
		System.out.println("========================================");
		// 배열 선언
		int studentCount = 10;
		// int 형 데이터가 5개 저장될 배열
		int students[] = new int[studentCount];
		
		// 입력
		for(int i = 0; i < students.length; i++) {
			students[i] = randomScore();
		}
		
		// 출력
		for(int i = 0; i < students.length; i++) {
			System.out.println("student[" + i + "] : " + students[i]);
		}
		
		// 평균
		int total = 0;
		for(int i = 0; i <students.length; i++) {
			total += students[i];
		}
		
		System.out.println("total : " + total);
		avg = (double)total/students.length;
		System.out.println("avg : " + avg);
		
	}

}
