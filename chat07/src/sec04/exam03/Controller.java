package sec04.exam03;

public class Controller {
	public MemberService service;
	//var MemberService service = new AService()
	public void setService (MemberService service) {
		this.service = service;
	}
}

Controller controller = new Controller();
Controller.setService(__________________);

//lesson07_30.png

1) new Service()			//x	부모라 안됨
2) new MemberService()		//o 본인 클론
3) new AService()			//o 자식이라서
4) new BService()			//o 자식이라서
5) new BoardService()		//x 사촌
6) new DService()			//x 사촌