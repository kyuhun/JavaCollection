package util.hashmap;

public interface MemberService {
	
	public void MemberJoin(String userid,String password,String name,int age,String address);
	public void Member();
	public String Memberlogin(String id, String passwd);
	public void exit();
	
}
