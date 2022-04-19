package j17_최상위클래스.controller;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.repository.user.User;
import j17_최상위클래스.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainController {
	
	private final Context context;
	private final UserService userService;
	
	public void index() { 
		User user = userService.addUser(context.getScanner());
		System.out.println(user);
	}

}
