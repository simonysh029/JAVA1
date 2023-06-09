package sec01.exam01;

class Number{
	static int num = 0; //스태틱 필드
	int num2 = 0; //인스턴스 필드
}

public class StaticExample {

	public static void main(String[] args) {
		Number number1 = new Number(); //첫번째 number
		Number number2 = new Number(); //두번째 number

		number1.num++; //클래스 필드 num을 1증가시킴
		number1.num2++; //인스턴스 필드 num을 1증가시킴
		System.out.println(number2.num); // 두번째 number의 클래스 필드 출력
		System.out.println(number2.num2); // 두번째 number의 인스턴스 필드 출력
	}

}
