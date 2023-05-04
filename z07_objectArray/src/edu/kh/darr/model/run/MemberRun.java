package edu.kh.darr.model.run;

import edu.kh.darr.model.service.MemberService;

public class MemberRun {
	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.displayMenu();
	}

}
