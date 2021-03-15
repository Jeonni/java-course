import java.util.Random;

public class File2_Array {

		static Random r = new Random();
		// 60~100 사이의 랜덤한 값을 반환한느 기능
		public static int randomNumber() {
			return r.nextInt(201) - 100;
		}
		
	public static void main(String[] args) {
		// * 배열 (Array)
		//  같은 타입의 데이터들의 묶음
		int num; // 하나의 변수는 하나의 데이터만 저장된다.
		
		// 배열 선언도 변수 선언과 같은 과정이 필요하다.
		// 변수 선언처럼 타입과 식별자를 작성하고 추가적으로 배열 기호 ([])를 작성한다.
		// 이때 배열 기호([]) 안에는 아무것도 작성하지 않는다.
		int numbers[];
		// → 배열을 선언했다고 해서 다수의 데이터를 저장하는 저장 공간이 만들어진 것이 아니다.
		int length = 10;
		// * 배열 생성
		//   - new 키워드 : 특정 데이터를 메모리에 할당하여 만든다.
		//   - new int [10] : int 형 데이터를 저장하기 위한 공간을 메모리에 할당한다.
		//    → 반환 값 : 메모리에 할당된 주소를 반환한다.
		//   즉 numbers 변수가 가지고 있는 값은 메모리 주소이다.
		//    → 메모리 주소를 저장하는 변수 : 참조 변수 (Reference Variable)
		numbers = new int [length];
		System.out.println(numbers);
		
		// * 배열의 길이
		//   - 참조 변수가 참조하고 있는 영역의 크기를 JVM이 관리하기 때문에 바로 값을 알아올 수 있다.
		System.out.println("length : " + length);
		System.out.println("numbers.length : " + numbers.length);
		
		//   - 배열의 크기는 고정적이기 때문에 배열의 크기를 그때 그때 바로 수정할 수 없다.
		//     따라서 배열의 크기를 바꿔야한다면 새로운 배열을 생성해야 한다.
		numbers = new int[numbers.length + 5];
		System.out.println("numbers.length : " + numbers.length);
		
		// * 배열의 사용 방법
		//  - 배열 : 인덱스와 인덱스에 대응되는 데이터들로 이뤄진 집합
		//  - 인덱스 : 배열 내의 데이터(요소)에 붙여지는 0 이상의 정수형 번호
		//                 : 인덱스는 0부터 시작해서 1씩 증가한다.
		//                 : 인덱스의 항상 마지막은 '배열의 개수 - 1' 이다.
		//                 : 0 <= index < length
		//  - 참조 변수[index] : 참조변수가 참조하고 있는 메모리 영역에서
		//                                      index에 해당하는 저장공간에 접근한다.
//		numbers = new int [5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		
		// 인덱스는 정수형 데이터이기 때문에 변수로도 사용할 수 있으며
		// 반복문으로도 사용할 수 있다.
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("index : " + i);
			// numbers[i] = (i+1) * 10;
			numbers[i] = randomNumber();
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		// * 배열의 초기화
		//   - 베열은 생성되면 기본 값으로 초기화가 되어지지만
		//   - 원하는 값으로도 초기화를 할 수 있다.
		//   - 배열의 길이는 중괄호 ({}) 내의 데이터 수로 맟줘진다.
		
		int iArr[] = new int[] {30,50,60,70,10,20,70};
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] = " + iArr[i]);
		}
		
		// 참조 변수를 선언과 함께 초기화할 때에는 'new int []' 를 생략할 수 있다.
		int iArr2 [] = {30, 50, 60, 70, 10, 20, 70};
		for(int i = 0; i <iArr2.length; i++) {
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);
		}
		
		// 이후에 배열을 초기화라혀면 ' new int [] ' 를 작성해야 한다.
		iArr2 = new int [] {10,20,30,40,50};
		
 	}

}
