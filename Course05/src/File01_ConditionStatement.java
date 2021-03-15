
public class File01_ConditionStatement {

	public static void main(String[] args) {
		// * 조건문
		//  특정 조건에 의해 수행되는 코드를 제어하는 제어문
		
		// ========================================================
		// * 단독 if문
		//  : 특정 조건을 만족할 때 코드를 수행하는 제어문
		//  : 만족하지 않을 경우에는 제어문 뒤에 명령어 또는 블록을 넘어간다.
		//  : if(조건식) {...}
		
		int num = 10;
		
		// num의 값이 20보다 크면 "20보다 큽니다."를 출력하는 if문을 작성
		if(num > 20)
		// if의 조건식이 true 일 때 수행할 명령어
		System.out.println("20보다 큽니다.");

		// ========================================================
		// * if-else 문
		//  : if문은 조건식을 만족할 때 코드를 수행하는 제어문이여서
		//  : 만족하지 않을 때의 코드는 제어할 수 없다.
		//  : 따라서 만족하지 않을 때의 코드를 제어하기 위한 블록이 'else' 블록.
		//  : else 블록 항상 if 뒤에 오며 if문의 조건식의 결과에 의해서 수행되기 때문에
		//  : 조건식을 작성하지 않는다.
		num = 10;
		
		// num의 값이 20보다 크면 "20보다 큽니다."를 출력하고
		// 그렇지 않으면 "20보다 작거나 같습니다."를 출력하는 제어문
		if(num > 20) System.out.println("20보다 큽니다.");
		else System.out.println("20보다 작거나 같습니다.");
		
		// ========================================================
		// * if-else if문
		//  : if-else 문은 하나의 조건식에 의해 두가지 경우를 처리하기 때문에
		//  : 다수의 경우를 처리하기에는 제한이 될 수 있다.
		//  : 다수의 경우를 처리하기 위한 제어문 : if-else  if
		//  : else 뒤에 if 를 작성하여 별도의 조건식을 추가적으로 작성한 형태
		//
		//  * 형태
		//  if(조건식1) {...}
		//  else if(조건식2) {...}
		//  ...
		num = 0;
		
		//  num의 값이 양수이면 "양수"를 출력
		//  음수이면 "음수"를 출력
		//  0이면 "0"을 출력하는 제어문을 작성
		if(num > 0) System.out.println("양수");
		else if(num < 0) System.out.println("음수");
		// else if (num ==0) System.out.println("0"); 과 같은 의미
		else System.out.println("0");
		
		System.out.println("프로그램 종료");
		

	}

}
