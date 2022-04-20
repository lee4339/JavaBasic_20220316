package j17_최상위클래스.controller;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.repository.user.User;
import j17_최상위클래스.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainController {
	
	private final Context context;
	private final UserService userService;
	
	public void signup() { 
		User user = userService.addUser(context.getScanner());
		System.out.println("[추가된 사용자정보]");
		System.out.println(user);
		
	}
	
	public void showUserAll() {
		System.out.println("[전체 사용자 리스트]");
		for(User user : userService.getUserAll()) {
			System.out.println(user);
		}
	}
	
	public void searchUser() {
		System.out.println("[사용자 조회]");
		User user = userService.getUserByUsername(context.getInstance().getScanner());
		System.out.println("[조회된 사용자 정보]");
		System.out.println(user);
	}

}
