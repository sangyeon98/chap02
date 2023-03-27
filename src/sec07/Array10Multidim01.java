package sec07;
	
public class Array10Multidim01 {
	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];  //다차원 배열 
		
		//배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		// 전체 학생의 수학 평균 구하기
		
		int totalStudent = 0;
		int totalMathSum = 0;
		
		for (int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length; // mathScores[i].length 이거는 3명 = totalStudent이거 숫자
			for (int k = 0; k < mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];			 // i 는 바깥 for문에서 정해줌, "반" 만 정해진거	
			} //2번째 f문끝
		} //처음 f문 끝
		double totalMathAvg = (double) totalMathSum / totalStudent;  //student = 6
		System.out.println("전체 학생의 수학 평균 점수: "+ totalMathAvg);
		System.out.println();
		/*
		 //각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		  int[][] englishScore = new int[2][];
		 */

	} //main e
} //class e




