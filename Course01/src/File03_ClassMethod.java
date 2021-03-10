//자바의 코드를 작성하기 위해선 반드시 class 블록이 작성되어져야 한다.
//	프로그램을 수행하기 위해서는 public static void main(String[] args) 메서드 블록이 필요하다.
//		파일을 생성할 때 체크박스를 통해서 생성해주거나, 클래스 내에서 main 입력 후 ctrl + space 를 통해서 자동 생성
//	모든 명령어는 반드시 메서드 내에서만 작성이 되어진다.

// 클래스 블록 : 필드 선언과 메서드 블록만 작성할 수 있다.
// 메서드 블록 : 클래스 내에 작성이 되어야 하며, 명령어와 제어문 블록만 작성할 수 있다.
// 제어문 블록 : 메서드 내에 작성이 되어야 하며, 명령어와 제어문 블록만 작성할 수 있다.

public class File03_ClassMethod {
	
	//	메서드
	//		sum 이라는 이름의 메서드
	public static void sum (int num1, int num2) {
		//	메서드 내에서 명령어를 작성한다.
		System.out.print(num1 + num2);
	}
	
	// 메서드 블록
	//	프로그램을 시작을 하는 메서드 (함수)
	//	JVM이 맨 처음 수행하는 메서드 블록이다.
	public static void main(String[] args) {
		System.out.print(300);
	}

}
