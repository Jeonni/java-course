import java.util.Scanner;

public class File03_Input {

	public static void main(String[] args) {
	 /*
	  *  입력 (Input)
	  *   프로그램 외부에서 내부로 데이터가 들어오는 과정
	  *   ex) 키보드, 마우스, 파일 읽기, 메시지 받기
	  *   
	  *   표준 입력 : System.in
	  *   
	  *  입력받는 과정
	  *   키보드 → 엔터를 누를 때까지 입력 → System.in → '001...010' → 프로그램
	  *    입력받은 값이 바이트 단위 들어오기 때문에  변환을 해주어야 하는데 이 과정이 쉽지는 않다.
	  *    이 변환을 해주는 클래스를 이용하여 입력을 받는다.
	  *    → Scanner 클래스
	  * 	키보드 → 엔터를 누를 때까지 입력 → System.in → '001..010' → Scanner → 'abc...', 50 → 프로그램
	  */
		
		// 따라서 앞으로 Scanner 클래스를 이용해서 입력을 받는다.
		// Scanner을 사용하기 위해서는 객체를 생성해야 한다.
		// import 자동 관리 : ctrl + shift + o(알파벳)
		Scanner input = new Scanner(System.in);
		
		// 입력을 받는 방법
		// 1. nextLine() : 문자열로 한 줄을 입력을 받는다.
		//	→ 입력된 값을 엔터(개행 문자)를 기준으로 끊어서 읽어온다.
		
		// 2. next() : 문자열로 한 단어를 입력을 받는다.
		//	→ 입력된 값을 공백 (개행 문자, 스페이스, 탭 등)을 기준으로 끊어서 읽어온다.
		
		// 3. next 자료형() : 자료형 데이터를 입력을 받는다.
		//	→ nextInt(), nextDouble(), nextBoolean() ...
		//	→ 입렫된 값을 공백(개행 문자, 스페이스, 탭 등)을 기준으로 끊어서 읽어온다.
		
		// 입력받는 값을 사용하려면 변수에 저장해야 한다.
		String str;
		// 엔터까지 문자열을 그대로 반환한다.
		str = input.nextLine();
		System.out.println("str : " + str);
		
		// 공백까지 문자열으 그대로 반환한다.
		str = input.next();
		System.out.println("str : " + str);
		
		int n = input.nextInt();
		System.out.println("n : " + n);
		
		// input을 통해서 키보드로부터 입력을 받는다.
		input.close();
		
	}

}
