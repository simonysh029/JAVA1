package sec02.exam06;

public class Test1 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while (i<10) {
			i++;
			total+=i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}

// 집에서 써보기(과정을 하나씩 수기로 기록하면서)