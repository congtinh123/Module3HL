package Session2;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Điểm trung bình, xếp loại
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm môn toán: ");
        float toan = sc.nextFloat();
        System.out.print("Nhập điểm môn lý: ");
        float ly = sc.nextFloat();
        System.out.print("Nhập điểm môn hóa: ");
        float hoa = sc.nextFloat();
        System.out.print("Nhập điểm môn anh: ");
        float anh = sc.nextFloat();
        System.out.print("Nhập điểm môn văn: ");
        float van = sc.nextFloat();
        float diemTB = (toan + ly + hoa + anh + van) / 5;
        System.out.println("Điểm trung bình: " + diemTB);
        if(diemTB >= 9){
            System.out.println("Xếp loại xuất sắc");
        }else if(diemTB >= 8 && diemTB < 9){
            System.out.println("Xếp loại giỏi");
        }else if(diemTB >= 6.5 && diemTB < 8){
            System.out.println("Xếp loại khá");
        }else if(diemTB >= 5 && diemTB < 6.5){
            System.out.println("Xếp loại trung bình");
        }else{
            System.out.println("Xếp loại yếu");
        }
    }
}
