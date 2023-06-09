package sec02.exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
//메소드 실행이 종료되면 없어지는 것이 일반적이지만, 메소드가 종료되어도 계속 실행 상태로 존재할 수 없다.
//따라서 final로 메소드를 선언해둔다.
	public void method2(int arg) {
		//메소드의 매개 변수나 로컬변수를 로컬 클래스에서 사용할 때만 제한이 있음.
		int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
//Inner(?) -?내부 설정 언어이기 떄문에?- final이 메소드에 붙고, 이 과정이 보통 스킵되어 마무리된다는 것을 인지해두자
//다른 메소드에서는 그렇지 않다.