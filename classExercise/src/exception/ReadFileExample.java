package exception;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("output.txt");//기본경로가 프로젝트폴더로 되어있어 그곳에 있어야 한다. 그렇지 않으면 "절대경로\\파일명.확장자" 입력해야함.
//			FileReader reader = new FileReader("input.txt");
					int character;
					
					while((character = reader.read())!= -1) {
						System.out.print((char) character);
					}
					reader.close();
		}catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
