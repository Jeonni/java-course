
public class File01_Operator {

	public static void main(String[] args) {
		// 연산자 (Operator)
		//	: 표현식에 따라 데이터를 연산하기 위한 문자 (기호)
		//	: 연산자는 피연산자들의 타입을 반드시 일치시킨다.
		//	: 그리고 그 결과 값도 같은 타입으로 나온다.
		
		
		// 1. 산술 연산자
		//  더하기 빼기 곱하기 나누기 나머지
		int num1 = 10;
		int num2 = 3;
		int result = 0;
		
		// 더하기 연산
		result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
		
		// 빼기 연산
		result = num1 - num2;
		System.out.printf("%d - %d = %d\n",num1, num2, result);
		
		// 곱하기 연산
		result = num1 * num2;
		System.out.printf("%d * %d = %d\n",num1, num2, result);
		
		// 나누기 연산
		result = num1 / num2;
		System.out.printf("%d / %d = %d\n",num1, num2, result);
		
		// 나머지 연산
		result = num1 % num2;
		System.out.printf("%d % %d = %d\n", num1, num2, result);
		
		// 문자열 서식 내에서 %를 출력하려면 '%%' 로 작성해야 한다.
		System.out.printf("%d %% %d = %d\n", num1, num2, result);
		
		// 나누기 관련 연산자들의 활용
		// 1. 배수 확인이 가능
		//     n의 배수 : n으로 나누어 떨어지는 자연수
		//                     : n으로 나눠서 나머지가 0인 자연수
		// 2. 특정 범위 반복이 가능하다.
		// 3. 숫자형의 단위 변환을 할 수 있다.
		
		// 나누기를 했을 때 실수 형태를 얻기 위한 방법
		// → 자료형 변환
		double dbNum1 = 10.0;
		double dbNum2 = 3.0;
		double dbResult = dbNum1 / dbNum2;
		System.out.printf("%f / %f = %f\n", dbNum1, dbNum2, dbResult);
		
		dbResult = dbNum1/ dbNum2;
		// dbResult = 실수 / 정수;
		// 컴파일러가 연산자의 피연산자들의 타입을 일치시킨다. → 형 변환
		System.out.printf("%f / %d = %f\n", dbNum1, num2, dbResult);
		
		// 형 변환
		// 기본 자료형 데이터의 타입이 다른 타입으로 변환
		
		// * 자동 형변환
		//  자동으로 형 변환이 이루어지는 형변환
		//
		//  - 조건
		// 1. 연산자의 타입을 맞추기 위해
		// 2. 자료형의 크기가 작은 타입에서 큰 타입으로 바뀐다.
		// ex)
		double db = 10;
		// 연산자의 타입을 맞추기 위해서 형 변환을 하는데 크기가 작은 int 형 >> double 형으로 변환한다.
		// int intN = 10.0;
		// ▷ double 형은 int 형으로 자동으로 형 변환이 이뤄질 수 없다.
		
		// * 강제 형변환
		// 강제로 형 변환이 이루어지는 형 변환
		//
		// - 조건
		// 1. 자료형의 크기가 큰 타입에서 작은 타입으로 변환하기 위해
		// 2. 연산자의 피연산자의 타입이 이미 맞춰진 상태에서 다른 타입으로 변환하기 위해
		//
		// - 방법
		//  식별자 앞에 소괄호와 함께 변환할 타입을 작성한다.
		dbResult = (double)10 / num2;
		dbResult = 10.0 / num2;
		dbResult = 10.0 / 3;
		dbResult = 10.0 / 3.0;
		dbResult = 3.33333;
		System.out.printf("%d / %d = %f\n", num1, num2, dbResult);
	}

}
