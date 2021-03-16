
public class File03_MethodOverloading {
	/*
	 *  메서드 오버로딩 (Method Overloading)
	 *    - 메서드와 관련된 다형성 중 하나
	 *    - 같은 이름의 메서드가 다양하게 정의되는 기능
	 */
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int addForThreeValue(int x, int y, int z) {
		return x + y + z;
	}
	
	// 위의 두 메서드 모두 매개변수로 들어오는 모든 값을 더하고 반환하는 기능이 동일하다.
	// 이때, 동일한 식별자더라도 매개변수의 타입 또는 개수가 다르면
	// 동일한 식별자로 정의가 가능하다.
	
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	static double add (double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int res1 = add(a, b);
		// 이미 정의되어 있는 add 메서드의 매개변수는 2개이기 때문에
		// 3개의 인자 값을 받을 수 없다.
		
		int res2 = add(add(a, b), c);
		int res3 = addForThreeValue(a, b, c);
		
		int res4 = add(a, b, c);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}

}
