package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true

		double v4 = 0.1;
		float v5 = 0.1f;
		// float은 소수점 표현에서 문제가 좀 있다.
		// float을 double형변환 시 정확히 0.1로 계산되지않고 소수점표현이 나온다.
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
	}

}
