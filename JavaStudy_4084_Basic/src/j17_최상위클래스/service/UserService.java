package j17_최상위클래스.service;

import java.util.Scanner;

import j17_최상위클래스.repository.user.User;

public interface UserService {
	public User addUser(Scanner scanner); 
	public User getUserByUsername(String username);
	public User[] getUserAll();
}
