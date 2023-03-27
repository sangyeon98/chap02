package sec07;

public class Array10question {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 다차원 배열

		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;

		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int count = 0;
		/**
		 * for (int i = 0; i < mathScores.length; i++) { for (int j = 0; j <
		 * mathScores[i].length; j++) { //i는 일차원으로 물어보는거임 length =3
		 * System.out.print(mathScores[i][j]+ " "); } System.out.println(); }
		 */

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println(mathScores[i][j] + " "); // print랑 if랑 위치 바꾸면 90, 92만나옴 alt+화살표위
				if(mathScores[i][j]>= 90) { //90보다 높은숫자만 true처리니까 count작동 
					count = count+1; // 2중 for문 안에 있어서 한명 찾고 한바퀴 돌아서 또 한번 느낌
				}
			}
		}
		System.out.println("count :" + count);

	} // main e

} // class e
