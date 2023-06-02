package sec04.exam02;

public class Child extends Parent{
	private String name;
	
	public Child() { 
		// //super가 숨어있다???
		//상속이면서 실행 클래스가 없어 자체적으로 실행이 안될때???
		//super를 넣으면 자체적으로 실행하고 끝나게됨??? //
		
		//내부에 자체 실행문이 있을 시 super를 입력하면 내부에서만 활용되고 마무리된다
		//반대로 실행 클래스가 없는 상속은 super를 통해 의미를 이을 수 있다.
		this("홍길동");
		System.out.println("Child() call");
	}	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
