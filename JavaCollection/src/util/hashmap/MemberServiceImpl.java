package util.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberServiceImpl implements MemberService {
/*==== 필드 =====*/
	
	//Map<String, Member> map = new HashMap<String, Member>();
	// 위 처럼 하는 것이 정석입니다. JSP, DB를 만지게 되면
	// <String,Object> 가 정석
	Map<String , String > map = new HashMap<String, String>();
	Member member = new Member();
	String userid, password,name,address;
	int age;
	
		public MemberServiceImpl() {
			
		}
	@Override
	public void MemberJoin(String userid,String password,String name,int age,String address) {
		
	member.setUserid(userid);
	member.setPassword(password);
	member.setName(name);
	member.setAge(age);
	member.setAddress(address);
	map.put("userid", member.getUserid());
	map.put(password, member.getPassword());
	map.put("name", member.getName());
	map.put("age", String.valueOf(member.getAge()));
	map.put("address", member.getAddress());
	}



	@Override
	public String Memberlogin(String id, String passwd) {
		String msg = "";
		if (map.get("userid").equals(id)&& map.get("password").equals(passwd))
		{
			msg = "환영합니다."+member.getAddress()+"에 사시는"
					+ member.getAge()+ " 세 되시는"
					+ member.getName()+"(님)입니다";
		} 
		else if(map.get("userid").equals(id)&& !(map.get("password").endsWith(passwd))) {
			
			msg = "비번이 틀렷습니다";
		}
		else{
			msg = "다시 입력하세요";
		}
		return msg;

	}

	@Override
	public void exit() {
		
	}



	@Override
	public void Member() {
	
		
	}

}
