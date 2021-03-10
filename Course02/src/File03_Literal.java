
public class File03_Literal {

	public static void main(String[] args) {
		/*
		 *  리터럴 (Literal)
		 *  	▶ 프로그램에서 연산/처리를 통한 값이 아닌 코드 상에 직접 표현한 값
		 *  
		 *  리터럴의 종류 (Literal Type)
		 *  	정수 리터럴
		 *  	실수 리터럴
		 *  	문자 리터럴
		 *  	논리 리터럴
		 *  	문자열 리터럴
		 *  	null 리터럴
		 */
		
		// 정수 리터럴
		//	 ▶ 정수 리터럴은 int형으로 컴파일 되어진다.
		//	 ▶ 리터럴이 int형 변수를 벗어난 값이면, long 타입의 리터럴로 작성해야 한다.
		//	( 리터럴 뒤에 L(대문자) 또는 l(소문자) 을 작성한다.
		//	Example) int integer = 2200000000;
		long integer = 2200000000L;
		
		// 정수 리터럴의 종류
		
		//	▷ 16진수 리터럴 : 0~9, a~f 까지 16개의 문자로 이루어진 수
		//		: 하나의 문자로 4bit를 모두 표현할 수 있다.
		int hexNumber = 0x0FFFFFFF;
		System.out.println("hexNumber: " + hexNumber);
		
		//	▷ 10진수 리터럴 : 0~9 까지 10개의 문자로 이루어진 수
		int decNumber = 011111111111;
		System.out.println("decNumber: " + decNumber);
		
		//	▷ 8진수 리터럴 : 0~7 까지 8개의 문자로 이루어진 수
		//		: 하나의 문자로 3bit를 모두 표현할 수 있다.
		int octalNumber = 0777;
		System.out.println("octalNumber: " + octalNumber);
		
		//	▷ 2진수 리터럴 :  0,1 로 이루어진 수
		int binaryNumber = 0b1111;
		System.out.println("binaryNumber: " + binaryNumber);
	}

}
