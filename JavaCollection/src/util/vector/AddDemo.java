package util.vector;

import java.util.Vector;

/*
  java.util.Vector 의 메소드 중에
  추가 기능을 담당하는 add()
 * */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> avengers = new Vector<String>();
		// vec.add("홍길동");
		String [] heros ={"iron","thor","hulk","hawk"};
		for (int i = 0; i < heros.length; i++) {
			avengers.add(heros[i]); 
		}
	// 자료구조는 저장과 검색이라는 기능을 위해 
	// 만들어진 클래스이다.
	// thor가 avenger 회원인지 검색?
	String thor = "thor";
	if (avengers.contains(thor)) {
		int idx = avengers.indexOf(thor);
		System.out.println("토르는 "+(idx+1)+"번쨰에 있습니다");
		
	} else {
		System.out.println("토르는 어벤저스 회원이 아닙니다.");
	}
	
	}
}
