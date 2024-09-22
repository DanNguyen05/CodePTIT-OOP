
import java.util.Scanner;

public class codeptit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai biến cách nhau một dấu cách
        String input = scanner.nextLine(); // Nhập một dòng
        String[] parts = input.split(" "); // Tách chuỗi thành mảng bằng dấu cách
        

        // Chuyển đổi các phần tử mảng sang kiểu dữ liệu mong muốn
        int a = Integer.parseInt(parts[0]); // Phần tử đầu tiên
        int b = Integer.parseInt(parts[1]); // Phần tử thứ hai

        if ( a<=0 | b <=0){
            System.out.print("0");
        }
        else{

        int cv = (b  + a)*2;
        int dt = a * b;
        
        System.out.println(cv +" "+dt);
        scanner.close();}
    }
}
