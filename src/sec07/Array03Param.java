package sec07;

/**
 * [모듈화]
 * - 평균을 구하는 로직을 메소드로 분리함
 *
 */
public class Array03Param {
	
	public static void main(String[] args) {
		int[] intArr = {80, 75, 70};
		
		//평균을 구해주는 메소드 호출
		double avg = getSum(intArr); //인자 (argument)로 배열을 전달  intArr = int 타입배열
		// 위에 double avg 빼고 getSum(intArr); 쓰고 밑에 프린트를 아래 return대신 쓰고 static대신 void로 가능
		System.out.printf("avg : %.2f", avg);
 	}//main e
	//평균을 구해주는 메소드
	private static double getSum(int[] arr) { //매개변수가 배열 타입  //getsum옆에 double는 밑에 return에 맞는 타입
		int sum =0;
		
		//반복문을 통해서 평균을 구하세요.
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum+ arr[i]
			System.out.println(arr[i]);
		}
		
		double avg =(double)sum / arr.length; //arr.length가 3
		return avg;  //값을 반환
		
	} //static double e

}//class e
