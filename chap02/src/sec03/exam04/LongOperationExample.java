package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		//byte result = value1 + value2 + value3;
		//자료형 범위 차이에 의해 문제
		System.out.println(result);
	}

}
