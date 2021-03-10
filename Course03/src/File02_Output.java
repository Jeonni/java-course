
public class File02_Output {

	public static void main(String[] args) {
		/*
		 *  출력 (Output)
		 *   프로그램 내부에서 외부로 데이터가 전달되어지는 과정
		 *   ex) 모니터, 스피커, 파일 저장, 메시지 전달 등 ...
		 *   
		 *  표준 출력 : System.out
		 *   
		 *  모니터에 출력하는 방법
		 *   1. System.out.println() : 한 줄에 문자열을 출력 
		 *   2. System.out.print()  : 문자열을 출력, 개행이 되지 않는다.
		 *   3. System.out.printf() : 서식 지정자를 이용하여 문자열을 출력
		 *   
		 *  문자열(String)은 '더하기 (+)'를 지원
		 *    문자열은 모든 타입과 더하기가 가능
		 *    더하기 연사자를 기준으로 순서 상관 없이 하나의 문자열로 합쳐진다.
		 *    이때 더해진 결과 값의 타입 : '문자열 (String)' 
		 */
		
		System.out.println("2" + "2");
		System.out.println("2" + 2);
		System.out.println("2" + 2.01);
		System.out.println("2" + true);
		System.out.println(2 + "2");
		System.out.println("2 + 2 = " + (2+2));
	
		String name = "Ljy";
		int age = 22;
		System.out.println("name : " + name  + ", age : " + age);
		
		name = "Lee";
		age = 20;
		System.out.println("name : " + name + ", age : " + age);
		
		/*
		 *  문자열 서식
		 *   이력서 양식처럼 데이터만 있으면 완성되는 문자열
		 *   System.out.printf(문자열 서식, 문자열 서식에 대입할 데이터들)
		 *   문자열 서식 내에 데이터가 대입되기 위한 곳을 알리기 위한 문자
		 *   → 서식 지정자 : %로 시작하며 대입될 데이터의 타입과 같이 작성된다.
		 *   
		 * 원하는 문자열 서식 → name : 000, age : 00
		 * String strFormat  = "name : 000, age : 00";
		 */
		String strFormat = "name : %-5s, age : %d\n";
		System.out.printf(strFormat, name, age);
		
		name = "Jeonni";
		age = 22;
		System.out.printf(strFormat, name, age);
		
		// String 클래스 내의 format 메더스를 이용해서 문자열 서식을 통해 문자열을 만들 수 있다.
		String str = String.format(strFormat, name, age);
		System.out.println(str);
		
	}
}
