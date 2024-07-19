package Session2;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //tính chu vi và diện tích hình chữ nhật
        //tính chu vi và diện tích hình tròn
        //tính chu vi và diện tích tam giác
        Scanner sc = new Scanner(System.in);
        int choice = 0;
         while(true){
           System.out.println("Menu:"); 
           System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
           System.out.println("2. Tính chu vi và diện tích hình tròn");
           System.out.println("3. Tính chu vi và diện tích tam giác");
           System.out.println("4. Thoát");
           System.out.print("Mời bạn chọn chức năng: ");
           choice = sc.nextInt();
           switch (choice) {
            case 1:
                System.out.print("Mời bạn nhập chiều dài: ");
                float d = sc.nextFloat();
                System.out.print("Mời bạn nhập chiều rộng: ");
                float r = sc.nextFloat();
                float chuvi = (d + r) * 2;
                float dientich = d * r;
                System.out.println("Chu vi hình chữ nhật là: " + chuvi);
                System.out.println("Diện tích hình chữ nhật là: " + dientich);
                break;
            case 2:
                float pi = 3.14f;
                System.out.print("Mời bạn nhập bán kính: ");
                int x  = sc.nextInt();
                float chuvi1 = 2 * pi * x;
                float dientich1 = pi * x * x;
                System.out.println("Chu vi hình tròn là: " + chuvi1);
                System.out.println("Diện tích hình tròn là: " + dientich1);
                break;
            case 3:
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
                break;
            case 4:
                System.out.println("Thoát");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("Nhập sai, mời bạn nhập lại");
                break;
           }
        }
    }
}
