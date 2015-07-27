package util.vector;

public class Grade {
/*===== 필드 ======*/
	private int kor,eng,math;
	private String hakbun,name;

/*===== 생성자 =====*/
	public Grade() {} // 아래처럼 파라미터가 있는 생성자를 만들면 
					 // 디폴트를 별도로 추가해야 함.
	// setter 대신에 생성자로 학번, 이름, 3과목 점수를 입력 받음.
	public Grade(String hakbun, String name, int kor,int eng,int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor =kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}

	
/*====== 멤버메소드========*/
	//getTotal 메소드를 직접생성
	// 파라미터로 국어, 영어, 수학
	// 리턴값으로 파라미터 합계
	
	
	/*
	  메소드 이름이 같음에도 불구하고 파라미터 갯수나
	  혹은 타입이 다르면 서로 다른 메소드로 인식한다.
	  이를 객체지향 4대특징 중 하나인 다양성에서 
	  오버로딩이라고 한다.
	  주의 !! 오버라이딩은 상속관계, 구현관계에서 
	  @override 라고 붙은 메소드를 말함.
	 * */
	public int getTotal()
	{
		int total =0;
		total = this.kor + this.eng + this.math;
		
		return total;
		
	}
	
	@Override
		public String toString() {
			
			return "성적표 [이름 : "+name+" , 학번 : "+hakbun+" ]\n"
					+ "국어 : "+kor+" , 영어 : "+eng+" , 수학 : "+math+" \n"
					+ "총합 : "+getTotal()+"\n";
		}
}
