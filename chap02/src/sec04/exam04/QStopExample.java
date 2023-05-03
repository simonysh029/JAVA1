package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;		//keyCode가 113과 동일한 경우 실행
			}
		}
		
		System.out.println("종료");
	}

}

	//gui = graphic user interface 윈도우창?
	//throws exception 하는이유 - out이 아닌 in을 통해 내부를 직접 건들이게되므로 위험함