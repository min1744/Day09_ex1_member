package com.iu.member;

import java.util.Scanner;

import com.iu.view.MemberView;

public class MemberController {
	private Scanner sc;
	private Member [] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;

	public MemberController() {
		sc = new Scanner(System.in);
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
	}
	//start

	//1. 회원가입
	//2. 로그인
	//3. 회원정보 전체출력
	//4. 프로그램 종료
	public void start() {
		boolean check = true;
		Scanner sc = new Scanner(System.in);

		while(check) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 회원정보 전체출력\n4. 프로그램 종료");
			int select = sc.nextInt();
			if(select == 1) {
				Member m = mi.memberJoin();
				members = ma.add(members, m);
			}else if(select == 2) {
				Member member = mi.memberLogin(members);
				if(member != null) {
					System.out.println(member.getId() + "님 환영합니다.");
				}else
					System.out.println("로그인 실패");
			}else if(select == 3) {
				mv.view(members);
			}else if(select == 4) {

			}else
				check = !check;
		}

	}
}