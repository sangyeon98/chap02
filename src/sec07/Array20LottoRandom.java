package sec07;

import java.util.Scanner;

public class Array20LottoRandom {
	
	public static void main(String[] args) {
		
		//배열 선언 ( 6개 공간 담는 배열 선언(공간확보)) 
		int[] numArr = new int[6];  
		
		//세트 입력(Scanner - 2byte)
		Scanner scan = new Scanner(System.in); // System.in 1byte
		System.out.println("몇 세트의 난수를 발생시키겠습니까?");
		int set = scan.nextInt();  //정수 읽기
		
		//while
		while (set > 0) {
			// 난수 발생 for
			for (int i = 0; i < numArr.length; i++) {  //자릿수를 채우기  0~5번째 자릿수 밑에 for문에는 위에 자릿수에 숫자넣기
				//난수 1~45
				numArr[i] = (int) (Math.random() * 45) + i;
				for (int j = 0; j < i; j++) {  //j < i가 중요함 i가 자릿수를 만드니까 그 뒤에는 중요하지 않음
					if (numArr[j]== numArr[i] ) { //중복방지
						i = i -1;
						break;
					} //if e
				} //for2 e
			} // for e
			
			//한 세트 출력 (향상된 for문)
			for (int i : numArr) {
				System.out.print(i + "\t");			
			}
			System.out.println();
			set = set - 1; // -1씩 차감(set--) 
	
		} //while e
							
	} // main e 

} // class e
