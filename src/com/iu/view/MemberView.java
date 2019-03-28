package com.iu.view;

import com.iu.member.Member;

public class MemberView {
	
	//member 한명의 정보를 출력 하는 메서드
	public void view(Member member) {
		System.out.println("ID : "+member.getId());
		System.out.println("PW : "+member.getPw());
		System.out.println("AGE : "+member.getAge());
		System.out.println("Email : "+member.getEmail());
		System.out.println("Phone : "+member.getPhone());
	}
	
	//member 들의 정보를 출력하는 메서드
	public void view(Member [] members) {
		for(int i=0;i<members.length;i++) {
			Member member = members[i];
			this.view(member);
		}
	}
}