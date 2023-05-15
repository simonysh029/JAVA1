package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// int형으로 가지는 배열이름이 arr1 참조배열 형태의 선언 길이 3개짜리를 선언해 보세요.
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " +arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " +arr2[i]);
		}
		System.out.println("");
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("");
		
		//문자열을 가지는 배열이름이 arr3 참조배열 형태의 선언 길이3개 짜리를 선언해 보세요.
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " +arr3[i]);
		}
		System.out.println("");
		arr3[0] = "1";
		arr3[1] = "2";
		arr3[2] = "3";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println("");
	}

}
