package sec07;

/**
 * 세과목의 평균 구하기
 * 
 */
public class Array01Old {
	public static void main(String[] args) {

		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		sum = a + b + c; 
		//정수간 나눗셈은 몫이 정수(소숫점 버림)  예방 차원에서 3 -> 3.0으로 double
		double avg = sum / 3.0; //(3.0으로 써서 더블로 알아서 바뀌게 해줌, 큰타입으로 변형된다
		//double avg =(double)sum /3 ;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//총점
		System.out.println("총점: "+ sum);
		
		//평균(81.66666666667)
		System.out.println("1. 평균: " + avg);
		System.out.printf("2. 평균: %.2f\n" , avg);   //%나머지 .2 두번째까지 f(float)는 소수점 s는 문자
		System.out.printf("3. 평균: "+ Math.round(avg * 100)/100.0);   
		//round는(뒤에 반올림해서) double를 long(정수)으로 바꿈 > 100곱하는 이유는 81.666667을 8167로 변경 >
		//그걸 100으로 나누면 81.67로 나옴
		System.out.println();
		System.out.println(String.format("4. 평균: %.2f", avg));
			
		/**
		 * 81.66666667 * 100
		 * Match.round(8166.666667)  round는 정수로 바꿔줌 반올림해서
		 * 8167 / 100.0
		 * 81.67 
		 */
		
		
		
	}//main

}//class
