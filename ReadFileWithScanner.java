import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        // Đường dẫn đến file Hello.txt
        String fileName = "java.java/Hello.txt";

        // Sử dụng Scanner để đọc file
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Đọc từng dòng và in ra màn hình
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Đóng Scanner sau khi đọc file xong
            scanner.close();
        } catch (FileNotFoundException e) {
            // Xử lý ngoại lệ nếu file không tồn tại
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

