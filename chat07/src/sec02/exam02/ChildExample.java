package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); 이미 타입변환이 이루어져서 사용 불가능. 타입변환 이전에는 사용 가능했던 부분.
	}

}
