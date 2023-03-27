package sec06;

public class For1To100Sum {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			// sum += i; <가급적 이형태 사용
			sum = sum + i;

		}
		System.out.println("1~" + (i - 1) + "합:" + sum); // 7째줄에서 마지막실행 했을때 101이 진행되고 밑으로 내려오니까 -1해줌

	}
}
