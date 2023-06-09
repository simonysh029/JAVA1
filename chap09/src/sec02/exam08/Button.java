package sec02.exam08;

public class Button {
	OnClickListener listener; //interface type field

	public void setOn
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
