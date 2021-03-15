import java.util.Scanner;

public class File03_LoopControl {

	public static void main(String[] args) {
		// * 반복문 제어
		
		// * break문
		//  반복문을 종료하기 위한 키워드
		//  반복 수행 도중에 반복문을 종료하기 위해 사용된다.
		
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		// 0을 입력할 때까지 정수를 입력 받아 출력하도록 장성
		// 음수를 입력받았을 때는 출력하지 않고 다시 입력을 받도록 한다.
		while(n != 0) {
			System.out.print("Enter an integer : ");
			n = input.nextInt();
			
			// n이 0이면 반복문을 종료
			if(n==0) {
				System.out.println("System End");
				break; 
			}
			if(n<0) continue;
		}
		
		// 장점
		//  - 들여쓰기 최소화
		//  - 중요한 코드에 불필요한 값이 들어오는 경우가 없다.
		System.out.println("n : " + n);
		
		input.close();

	}

}
