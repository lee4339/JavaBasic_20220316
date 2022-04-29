package j20_예외;

import java.io.IOException;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		String[] names = {"일번", "이번", "삼번"};
		
		try {
			for(int i = 0; i < names.length + 1; i++) {
				System.out.println(names[i]);
			}			
//		}catch (IndexOutOfBoundsException e) {
//			System.out.println("예외가 발생 하였습니다.");
//			for(int i = 0; i < names.length; i++) {
//				System.out.println(names[i]);
//			}
//		}catch (NullPointerException e) {
//			System.out.println("객체 데이터 Null 오류");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외가 발생 하든 하지 않든 무조건 실행");
		}
		
		ArrayData arrayData = new ArrayData();
		
		try {
			arrayData.printArray(names);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			arrayData.callException();
		}catch(CustomException e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터 저장");
		System.out.println("프로그램 종료");
		//버그는 프로그램 외 문제로 인한 문제
		//예외(오류) 프로그램 내 문제

	}

}
