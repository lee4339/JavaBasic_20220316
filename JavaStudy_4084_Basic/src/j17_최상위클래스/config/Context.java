package j17_최상위클래스.config;

import java.util.Scanner;

import j17_최상위클래스.controller.MainController;
import j17_최상위클래스.service.UserService;
import j17_최상위클래스.service.UserServiceImpl;
import lombok.Getter;

@Getter
public class Context {
	private static Context instance;
	private Scanner scanner;
	private MainController mainController;
	private UserService userService;
	
	private Context() {
	}
	
	public void setting() {
		
		// 일반객체
		scanner = new Scanner(System.in);
		
		// 서비스객체
		userService = new UserServiceImpl();
		
		// 컨트롤러 객체
		mainController = new MainController(instance, userService);
		
	}
	
	public static Context getInstance() {
		if(instance == null) {
			instance = new Context();
		}
		
		return instance;
	}
}
