package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20;
		//long var3 = 1000000000000; //컴파일 에러 21억이 넘으면 long으로 써야한다 .(-2,147,483,648 ~ 2,147,483,647)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
