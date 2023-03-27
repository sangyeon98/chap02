package sec06;



public class Pyramid {
	public static void main(String[] args) {
		//10층 직삼각형 피라미드
	
		for (int i = 1; i <=10; i++) {
			for (int j =0; j < i; j++) {  //순서가 0<1 출력 후 밑에줄 0<2출력, 1<2출력  2<2확인후 밑에줄 반복
				System.out.print("*");	// < print가 포인트 옆으로 찍어야해서	
			}
			System.out.println(); //다음줄로 내려가시오(아무것도 안쓸때) (println)
	}
	}
}
