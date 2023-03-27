package sec06;

// 1~10짝수의 합
public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~10 짝수의 합: " + sum);

	}// main e

}// class e
