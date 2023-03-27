package sec06;

//1~10짝수의 합
public class While1To10Sum {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;

		/**
		 * while (i<=10) { if (i % 2==0) { sum += i; } i++; }
		 */

		while (true) {
			if (i % 2 == 0) {
				sum += i; // 위에 줄에서 받아온 값을 누적시켜줌
			}
			if (i > 10) { // 10보다 커야 끝남 > 우리는 10까지 원하니까
				break;
			}
			i++;
		}

		System.out.println("1~" + (i - 1) + "합: " + sum); // 위에 10보다큰 11에서 만족으로 내려 와서 중간데 i-1해줌

	}

}
