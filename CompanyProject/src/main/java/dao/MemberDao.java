package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	
	void addMember(Member member);
	
	List<Member> login(String username,String password);
	
	boolean checkUsername(String username);

}
