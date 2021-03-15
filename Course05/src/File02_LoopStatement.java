import java.util.Scanner;

public class File02_LoopStatement {

	public static void main(String[] args) {
		// * 반복문
		//  프로그램의 흐름을 특정 횟수 또는 특정 조건에 의해 반복 수행되도록 하는 제어문
		
		// * for문
		//  "Hello World!"를 다섯번 출력
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		// ==============================================
		
		int N = 10;
		
		System.out.println("===========================");
		for(int count = 0; count < N; count++) {
			System.out.println((count + 1) + " : Hello World!");
		}
		
		System.out.println("===========================");
		for(int count = 1; count <= N; count++) {
			System.out.println((count) + " : Hello World!");
		}
		
		System.out.println("===========================");
		for(int n = 300; n <= 350; n+=2) {
			System.out.println("n : " + n);
		}
		
		
		// * while 문
		//  특정 조건을 만족할 때까지 반복수행하는 반복문
		//  사용자가 0을 입력할 때까지
		//  사용자가 종료할 때까지
		//   → 특정 횟수가 범위 없이 언제 끝날지 모르는 경우
		
		// * do-while 문
		//  특정 조건을 만족할 때까지 반복 수행하는 반복문
		//   → while 문과의 차이점
		//           1. 최소 1번은 수행 된다.
		//           2. while  :  선 검사, 후 실행
		//           3. do-while : 선 실행, 후 검사
		
		boolean flag = true;
		
		//  조건식의 결과가 항상 true 가 되면 무한루프에 빠지게 된다.
		int n = 0;
		while(flag) {
			System.out.println("Hello World!");
			
			n++;
			if(n == 10) flag = false;
		}

		// ==============================================
		
		//  사용자가 0을 입력할 때까지 숫자를 입력 받아서 출력한다.
		//  → 종료가 되는 조건
		//  사용자가 0 외의 정수를 입력하는 동안 숫자를 출력한다.
		//  → 실행되는 조건
		
		final int INIT_NUM = 1;
		n= INIT_NUM;
		Scanner input = new Scanner(System.in);
		
		// ==============================================
		// * while 문
		while(n!=0) {
			// 조건식이 true인 경우 수행할 블록
			System.out.println("Enter a number : ");
			n = input.nextInt();
			System.out.println("n is " + n);
		}
		
		System.out.println("==============================================");
		
		// ==============================================
		// * do-while 문
		n = 0;
		do {
			// 조건식이 true 일 경우 수행할 블록
			System.out.println("Enter a number");
			n = input.nextInt();
			System.out.println("n is " + n);
		}while(n != 0);
		
		input.close();
	}

}
