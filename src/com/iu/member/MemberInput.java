package com.iu.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}
	
	//memberLogin
	//매개변수로 Member[]를 받아서
	//member를 리턴
	public Member memberLogin(Member [] members) {
		Member member = null;
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		for(int i = 0; i < members.length; i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	
	//memberJoin
	//id, pw, 나이, 이메일, 전화번호
	//member를 리턴
	public Member memberJoin() {
		Member member = new Member();
		System.out.print("아이디를 입력하세요 : ");
		member.setId(sc.next());
		System.out.print("패스워드를 입력하세요 : ");
		member.setPw(sc.next());
		System.out.print("나이를 입력하세요 : ");
		member.setAge(sc.nextInt());
		System.out.print("이메일을 입력하세요 : ");
		member.setEmail(sc.next());
		System.out.print("핸드폰 번호를 입력하세요 : ");
		member.setPhone(sc.next());

		return member;
	}
}