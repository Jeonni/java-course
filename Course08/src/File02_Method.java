
public class File02_Method {
	
	/*
	 *  메서드 (Method)
	 *    - 객체가 수행하는 기능 또는 행동을 의미
	 *    
	 *    용어
	 *      - 반환 타입 : 메서드의 결과 값의 데이터 타입
	 *                          : 메서드의 결과 값이 없는 경우엔 void 작성
	 *      - 매개 변수 : 메서드가 호출할 때 전달되어지는 값을 받는 변수
	 *                          : 파라미터 (Parameter)라고도 불린다.
	 *      - 인자 값 : 메서드가 호출할 때 전달되어지는 값
	 *                      : argument 라고도 불린다.
	 *      - 반환 값 : 메서드의 결과 값으로 호출된 곳으로 반환되어지는 값
	 *                      : return 키워드를 통해서 반환된다.
	 *      - return : 일반적으로 반환 값을 반환할 때 사용하는 키워드
	 *                     : 메서드를 호출한 곳으로 되돌아가는 역 
	 */
	
	// f(x) = x + 10
	static int f (int x) {
		return x + 10;
	}
	
	static int g(int x) {
		return x * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(f(10));
		// → System.out.println(20);
		
		System.out.println(f(20));
		// → System.out.println(30);
		
		System.out.println(f(30));
		// → System.out.println(40);
		
		System.out.println(g(f(10)));
		// → System.out.println(g(20));
		// → System.out.println(40);
	}

}
