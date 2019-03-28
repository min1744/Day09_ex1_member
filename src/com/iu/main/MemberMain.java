package com.iu.main;

import com.iu.member.Member;
import com.iu.member.MemberController;
import com.iu.member.MemberInput;
import com.iu.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		//프로그램을 시작.
		//프로그램 테스트 목적
		/*MemberInput mi = new MemberInput();
		MemberView mv = new MemberView();
		Member [] members = new Member[100];
		for(int i = 0; i < members.length; i++) {
			Member member = new Member();
			member.setId("id" + i);
			member.setPw("pw" + i);
			members[i] = member;
		}
		Member m = mi.memberJoin();
		System.out.println(m);*/
		MemberController mc = new MemberController();
		mc.start();
	}
}