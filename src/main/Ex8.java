package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외처리 미루기
public class Ex8 {

	public static void main(String[] args) {
		// 함수 호출시 에러남
		try {
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	// throws: open 함수를 사용하는 쪽으로 예외처리를 미루는 방법
	public static void openTextFile() throws FileNotFoundException {
		FileInputStream stream = new FileInputStream("src/main/a.txt");
	}

}

// 예외처리 방법
// 1. try-catch
// 2. throws : 함수를 사용하는 쪽에서 예외처리를 해야할 때 사용!