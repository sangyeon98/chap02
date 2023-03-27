package sec03;

public class SubStringExam {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);  //숫자부터 뒤에까지 다 
		System.out.println(secondNum);
	}

}

