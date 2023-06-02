package sec04.exam04;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		//Controller.setService(new Service());
		//Controller.service.login();
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();
	}

}
