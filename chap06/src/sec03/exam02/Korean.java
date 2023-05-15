package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String n, String s) {
		this.name = name; // this.name = name; // this. 자기 자신을 의미(필드) -> 필드를 초기화하는게 생성자 / 개념상으론 instance 변수 즉 class라 할 수도 있다. (static)
		this.ssn = ssn;
	}
	
	
	
}
