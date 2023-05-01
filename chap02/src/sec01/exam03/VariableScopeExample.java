package sec01.exam03;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		//int v3 = v1 + v2;
		//v2의 값은 if(v1>10){~~~}, 즉 함수 의 내용을 넘어가는 순간 인식할 수 없다.
		//sysout ctrl+space
	}

}
