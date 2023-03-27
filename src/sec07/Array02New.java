package sec07;

/**
 * 배열을 사용하여 세 과목의 평균 구하기
 */
public class Array02New {
	
	public static void main(String[] args) {
		//합계변수
		int sum = 0;
		//배열 변수를 선언과 동시에 초기화
		int intArr[] = {80, 75, 90};
		//이런 형태로 초기화 할 수도 있음
		intArr[0] = 80;
		intArr[1] = 75;
		intArr[2] = 90;
		
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
			System.out.println(intArr[i]);		
		}
		
		double avg =(double)sum / intArr.length;  // intArr.length 정수여서 앞에  (double)sum 사용
		System.out.printf("avg : %.2f", avg);
		
	}

}




/**for (int i = 0; i < intArr.length; i++) {    //intArr.length는 3대신인거  

	//int sum = 0; 여기서 sum을 선언하면 for문 밖에서 sum을 쓰지 못함
sum = sum+intArr[i];
System.out.println(intArr[i]);
}
*/