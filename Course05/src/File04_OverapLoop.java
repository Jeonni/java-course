
public class File04_OverapLoop {

	public static void main(String[] args) {
		// * 중첩 반복문
		//  반복문 내에 또 다른 반복문을 작성한 형태
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			for(int j = 21; j <= 30; j++) {
				System.out.println("	j : " + j);
			}
		}

	}

}
