package Session2;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //tính chu vi và diện tích hình tam giác
        //kiểm tra điều kiện có phải tam giác không
        Scanner sc = new Scanner(System.in);
        while (true) {
             System.out.print("Nhập cạnh a: ");
                int a = sc.nextInt();
                System.out.print("Nhập cạnh b: ");
                int b = sc.nextInt();
                System.out.print("Nhập cạnh c: ");
                int c = sc.nextInt();
                if(a + b > c && a + c > b && b + c > a){
                    float chuvi2 = a + b + c;
                    float p = chuvi2 / 2;
                    float dientich2 = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Chu vi tam giác là: " + chuvi2);
                    System.out.println("Diện tích tam giác là: " + dientich2);
                } else {
                    System.out.println("Đây không phải tam giác");
                }
        }
    }
}
