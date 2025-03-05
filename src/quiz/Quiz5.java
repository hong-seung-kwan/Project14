package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
//		// 키보드를 통해 값을 입력받는 기능
//		Scanner scanner = new Scanner(System.in);		
//		
//		// nextInt: 정수를 입력받는 함수
//		int num = scanner.nextInt(); // 다른 타입의 값이 들어와서 에러남
		
		try {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt(); 
		} catch (Exception e) {
			System.out.println(e);
		}		
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
}
