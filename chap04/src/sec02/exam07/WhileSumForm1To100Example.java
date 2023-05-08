package sec02.exam07;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<= 100)	{
			sum += i; //순서중요
			i++;
		}
		System.out.println("1~" +(i-1)+"합 : " + sum);
		
	}

}
