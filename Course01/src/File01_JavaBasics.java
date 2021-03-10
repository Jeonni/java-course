
public class File01_JavaBasics {

	public static void main(String[] args) {
		// 주석 (comment)
		//		프로그램의 실행에 있어서 영향이 없는 문구를 작성하는 기능
		//		코드 또는 프로젝트를 설명할 때 사용한다.
		//	단축키
		//		한 줄 주석 설정/해제		:	ctrl + /
		//		다수의 줄 주석 설정		:	ctrl + shift + /
		//		다수의 줄 주석 해제		:	ctrl + shift + \
		
		//	console 창에 "Hello Java"를 출력하는 명령문
		System.out.println("Hello Java");
		
		/*
		 * 	"Hello Java"	문구를
		 * 	console 창에
		 * 	4번 더 출력하는 구간
		 */
		
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		/*
		 * 	Terms for creating programming
		 * 	- 프로그래밍을 작성하기 위한 용어
		 * 
		 * 	식별자 (identifiers)
		 * 		클래스, 메서드, 변수 등의 이름을 지정하여 구분하기 위한 문자
		 * 		일반적으로 작성된 문자들이 대부분 식별자이다.
		 * 		식별자는 JVM 이 해석하고 사용하는 이름 (단어)
		 * 
		 * 	표현식 (expressions)
		 * 		데이터 또는 연산을 표현하기 위한 식
		 * 		a + 5
		 * 		a / 2
		 * 	
		 * 	명령어 (command)
		 * 		프로그램의 처리 또는 데티어의 값을 연산/처리 하는 하나의 문장
		 * 		하나 이상의 표현식이 포함되어 있다.
		 * 		문장의 마침표를 찍듯이 명령어의 마지막에는 세미콜론 (;)을 작성해야 한다.
		 * 		a = a + 5; 		→		a + 5 한 값에 a를 저장하라.
		 * 
		 * 	블록 (block)
		 * 		여러 명령어들을 하나의 묶음으로 만드는 단위
		 * 		블록을 만들기 위해서는 중괄호 {} 를 사용해야 한다.
		 * 		클래스, 메서드, 제어문 등이 블록을 통해서 수행된다.
		 * 		명령어 뿐만 아니라 블록도 포함해서 하나의 묶음으로 만들 수 있다.
		 * 		블록을 만들고 그 안에 코드를 작성할 때 한 번의 들여쓰기를 하여, 가독성을 높인다.
		 * 		들여쓰기 : tab
		 * 		자동 들여쓰기 : ctrl + i
		 * 
		 * 	클래스와 메서드 (class and method)
		 * 
		 * 		메서드(method)
		 * 			명령어들을 감싼 블록이고 하나의 기능을 의미한다.
		 * 			반드시 클래스 내에서 작성이 되어져야 한다.
		 * 		
		 * 		클래스 (class)
		 * 			다수의 메서드를 감싼 블록이고 하나의 객체를 의미한다.
		 * 			즉, 다수의 기능을 가진 개체이다.
		 * 
		 */
	}

}
