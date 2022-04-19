package j17_최상위클래스.service;

import java.util.Scanner;

import j17_최상위클래스.repository.user.User;

public class UserServiceImpl implements UserService {

	@Override
	public User addUser(Scanner scanner) {
		String username, password, name, email;
		System.out.println("[사용자 정보 추가]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		
		return User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User[] getUserAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
