package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;		//interface는 생성자를 만들 수 없기 때문에
		rc = new Television();	//변수 선언 후 interface에 대입한다.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();		
	}

}
