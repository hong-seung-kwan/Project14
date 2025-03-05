package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// finally문
public class Ex7 {

	public static void main(String[] args) {

		// 상대경로: 현재 위치를 기준으로 작성
		// 절대경로: root 폴더부터 작성
		
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다");

			int i = 10 / 0;
			// 중간에 프로그램이 종료되면서 close 실패

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");
		}
		
		// finally: 마지막에 무조건 실행되는 블록
		// 에러의 발생여부와 상관없이 무조건 실행해야 하는 코드를 작성
	}
}
