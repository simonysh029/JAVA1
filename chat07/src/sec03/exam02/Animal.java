package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//오버라이드 해야 한다.
	public abstract void sound();
}
