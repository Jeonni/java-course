
public class File02_Operator2 {

	public static void main(String[] args) {
		// 증감 연산자
		//  ++, --
		int a = 10;
		int b = 10;
		
		// * 전위 증가
		int r1 = ++a;
		
		// * 후위 증가
		int r2 = b++;
		
		// 변수 a, b 모두 1씩 증가된 값이 출력된다.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// * 전위 증가 : 결과 값을 증가된 값으로 반환 받는다.
		System.out.println("r1 : " + r1);
		// * 후위 증가 : 결과 값을 증가되기 전의 값으로 반환 받는다.
		System.out.println("r2 : " + r2);
		
		// * 대입 연산자
		//  변수에 데이터를 대입(저장) 하기 위한 연산자
		
		// * + 복합 대입 연산자
		//   - 다른 연산자와 대입 연산자를 합친 하나의 연산자
		//   - 두 가지의 연산이 모두 이뤄진다.
		//  조건 : 두 연산자의 좌측 피연산자가 동일한 변수일 때, 복합 대입 연산자로 작성할 수 있다.
		
		a = 10;
		// a의 값을 5 증가된 값으로 저장하기 위해
		a = a + 5;
		// 위의 코드를 복합 대입 연산자를 통해 작성할 수 있다.
		a += 5;
		
		// * 조건 연산자
		//   - 조건에 따라 반환되는 값이 결정되는 연산자
		//   - 조건의 결과값은 항상 논리값이다.
		//   - 논리값에 따른 반환할 값을 지정하여 조건에 따라 반환되는 값이 달라진다.
		//   - 형태 : (조건식 ? true 일 때 반환할 표현식) : (false 일 때 반환할 표현식);
		boolean bool = false;
		// bool의 값이 true이면 "is true"를 저장, 아니면 "is False"를 저장
		String resultStr = bool == true ? "is true" : "is false" ;
		
		System.out.println("bool " + resultStr);
		
	}

}
