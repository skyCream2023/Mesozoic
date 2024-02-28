package exception001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DinoTest1 {
    public static void main(String[] args) {
        try {
            readDinosaurData("dinosaur_data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 동안 오류가 발생했습니다.");
        }
    }

    public static void readDinosaurData(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}