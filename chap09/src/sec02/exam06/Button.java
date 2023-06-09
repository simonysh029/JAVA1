package sec02.exam06;
//중첩 interface
public class Button {
	OnClickListener listener; //interface type field 선언
//생성자못만들어 돌려세팅	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;//매개변수를 통한 형변환-다형성생김
	}

	void touch() {
		listener.onClick();
	}	
	
	static interface OnClickListener {
		void onClick();
	}
}
