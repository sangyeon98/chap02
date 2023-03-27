package sec06;

public class EvenSum2 {

	public static void main(String[] args) {
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				//System.out.println(i);
				sum2 += i;
			}
			if (i % 3 == 0) {
				//System.out.println(i);
				sum3 += i;
			}
		}
		System.out.println("1~10 짝수의 합: " + sum2);
		System.out.println("1~10까지 3의배수합: " + sum3);
	}
}
