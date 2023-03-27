package sec07;

public class Array19Module {
	public static void main(String[] args) {

		//// 기본 데이터를 저장하고 있는 배열
		// 1. 학생명 배열
		String[] names = { "최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안" };

		// 2. 성적 배열
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 90 };

		int sum = 0; // 총점
		double avg = 0.0; // 평균

		sum = sum(scores);

		// 평점 구함
		avg = (sum * 1.0) / scores.length; // (double)scores.length;가능 1.0곱하는거 대
		System.out.printf("평균점수는\" %4.1f점\" \n", avg);  //4.1 = 4자리쓰는데 소숫점 한자리까지 > 앞에 띄워써짐 \n으로 한줄띄움 

		// 최고 점수와 최고 점수의 학생 출력
		maxScore(names, scores);

	}

	private static void maxScore(String[] names, int[] scores) {
		int max = 0; // 큰수 임시 저장 변수
		String maxname = ""; // 최고 점수의 학생 저장 변수

		// 최고 점수와 최고 점수 학생명 구함
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {// 임의의 수와 모든 요소를 비교해 가면서 큰수 찾기
				max = scores[i];
				maxname = names[i];
			}
		}
		
		System.out.printf("최고점은 \"%2d점\" 입니다. \n", max);
		System.out.println("최고성적은 " + maxname + "님 입니다.");
	}

	private static int sum(int[] scores) {
		int sum = 0;
		// 총점 구함
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}
} // class e
