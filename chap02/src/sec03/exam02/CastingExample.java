package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}

// 강제 형변환 casting <-> 자동 형변환 promotion
//byte(정수) < short(정수)/char(문자) < int(정수) < long(정수) < float(실수) < double(실수)