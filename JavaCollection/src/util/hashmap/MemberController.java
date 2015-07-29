package util.hashmap;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {


	MemberService service = new MemberServiceImpl();
	Scanner scanner = new Scanner(System.in);	
	String input = "" ;
	
	
	while (true) {
		System.out.println("[JOIN]:회원가입,[LOGIN]: 로그인, [LOGOUT]: 로그아웃");
		input = scanner.next();
		if(input.equals("logout")){
			System.out.println("로그아웃!!");
			break;
		}
		else {
			switch (input) {
			case "join":
				System.out.println("아이디 :");
				String userid = scanner.next();
				System.out.println("비밀번호 :");
				String password = scanner.next();
				System.out.println("이름 :");
				String name = scanner.next();
				System.out.println("나이 :");
				int age = scanner.nextInt();
				System.out.println("주소 :");
				String address = scanner.next();
				service.MemberJoin(userid,password,name,age,address);
				System.out.println("회원가입 성공");
				break;
			case "login":
				System.out.println("아이디 입력:");
				String userid2 = scanner.next();
				System.out.println("비밀번호 입력:");
				String password2 = scanner.next();
				String result = service.Memberlogin(userid2 ,password2);
				String flag = result.substring(0, 5);
				if (flag.equals("환영합니다")) {
					System.out.println(result);
			} else if(flag.equals("비번이 틀")){
				
			}
				break;
				
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
				}
	
	}
}
