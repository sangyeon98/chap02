package sec06;

import java.util.Scanner;

public class LoginCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		String id = scan.nextLine();

		if (id.equals("Java")) { // 아이디가 틀리면 패스워드 안물어보는거

			System.out.println("패스워드를 입력하세요.");
			String pw = scan.nextLine();

			if (pw.equals("1234")) {
				System.out.printf("%s님 환영합니다.\n", id); // 뒤에있는 id가 %뒤에 옴 s는 만능 (id값이 앞으로 옴)
			} else {
				System.out.println("비밀번호가 올바르지 않습니다.");
			}
		} else {
			System.out.println("계정이 올바르지 않습니다. \n");
		}
	}
}

//내가만든거
/**
 * if(pss.equals("1234")) { System.out.println(id+"님 환영합니다."); }else {
 * System.out.println("패스워드가 틀립니다."); }
 */

/**
 * 일단 아이디랑 패스워드 받을떄 Scanner scan = new Scanner(System.in);
 * 
 * 
 * System.out.println("아이디를 입력하세요."); String id = scan.nextLine();
 * 
 * System.out.println("패스워드를 입력하세요."); String pw= scan.nextLine();
 * 
 * 
 * if(id.equals("Java")) {
 * 
 * if(pw.equals("1234")) { System.out.printf("%s님 환영합니다.\n",id); //뒤에있는 id가 %뒤에
 * 옴 s는 만능 (id값이 앞으로 옴) }else { System.out.println("비밀번호가 올바르지 않습니다."); } }else
 * { System.out.println("계정이 올바르지 않습니다. \n"); }
 */
