package sec07;

/**
 * 다음은 서울의 월별 평균 기온이다. 연평균 기온을 구하세요
 */
public class Array17SeoulTemp {

	public static void main(String[] args) {
		float[] monTemp = new float[] { -2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 24.9f, 29.4f, 27.8f, 14.4f, 6.9f,
				0.2f };

		float sum = 0.0f;
		double avg = 0.0;

		for (int i = 0; i < monTemp.length; i++) {
			sum += monTemp[i];
		}

		avg = sum / monTemp.length;
		System.out.printf("연평균 기온 : %.2ff", avg);
		System.out.println();

		float max = 0.0f;

		for (int i = 0; i < monTemp.length; i++) {
			if (monTemp[i] > max)
				max = monTemp[i]; //max했던거 max랑 비교하고 또 위로 올라가서 반복
		}
		System.out.println("가장 높은 기온 : " + max + "입니다.");
	}
}
