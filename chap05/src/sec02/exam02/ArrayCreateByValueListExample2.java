package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
	}
	public static int add(int[] scores) {//var scores = new int[] { 83, 90, 87 };

		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
			// scores값은 아래쪽 공식에서 계산 후 큰 의미가 없으며 다른 지칭으로 변경되도 큰 의미가 없다
			// 이후 계산된 값이 윗쪽으로 다시 들어감
		}
		return sum;
	}
}
