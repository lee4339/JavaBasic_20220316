package j21_데이터베이스.controller;

import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_데이터베이스.dao.UserDao;
import j21_데이터베이스.dto.User;
import j21_데이터베이스.dto.UserDtl;
import j21_데이터베이스.dto.UserMst;

public class DBMain {
	public static void main(String[] args) {
		UserDao userDao = new UserDao(DBConnectionMgr.getInstance());
		
		ArrayList<UserMst> userMstList = userDao.getUserMstAll();
		for(UserMst um : userMstList) {
			System.out.println(um);
		} 
		
		System.out.println();
		
		ArrayList<UserDtl> userDtlList = userDao.getUserDtlAll();
		for(UserDtl ud : userDtlList) {
			System.out.println(ud);
		}
		System.out.println();
		
		System.out.println(userDao.getUserByUsername("ccc"));
		
		System.out.println();
		
		HashMap<String, User> userMap = userDao.getUserByUsername("ccc");
		UserMst userMst = (UserMst)userMap.get("um");
		System.out.println(userMst.getName());
		
		/*
		 * 
		 * DAO -> User signin(String username, String password)
		 * 
		 * SELECT
		 * 	COUNT(um.username) + COUNT(um2.username) AS signin_flag
		 * FROM
		 * 	user_mst um
		 * 	LEFT OUTER JOIN user_mst um2 ON (um2.usercode = um.usercode AND um2.password = ?)
		 * WHERE
		 * 	um.username = ?;
		 * 
		 * 플래그가 1 --> 0 1, 1 0 아이디 또는 비밀번호 오류
		 * 플래그가 2 --> 1 1 로그인 성공
		 * 
		 */
	}
}
