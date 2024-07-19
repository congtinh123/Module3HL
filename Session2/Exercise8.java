package Session2;
import java.util.Scanner;

public class Exercise8 {
    // tạo menu chọn chức năng sử dụng while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(true){
           System.out.println("Menu:"); 
           System.out.println("1. Kiểm tra chẳn lẻ");
           System.out.println("2. Kiểm tra số nguyên tố");
           System.out.println("3. Kiểm tra số có chia hết cho 3");
           System.out.println("4. Thoát");
           System.out.print("Mời bạn chọn chức năng: ");
           choice = sc.nextInt();

           switch (choice) {
            case 1:
                System.out.print("Mời bạn nhập số cần kiểm tra: ");
                int n = sc.nextInt();
                if(n % 2 == 0){
                    System.out.println("Đây là số chẵn");
                } else {
                    System.out.println("Đây là số lẻ");
                }
                break;
            case 2:
                System.out.print("Mời bạn nhập số cần kiểm tra: ");
                int m  = sc.nextInt();
                if(m < 2){
                    System.out.println("Đây không phải số nguyên tố");
                } else {
                    boolean isPrime = true;
                    for(int i = 2; i <= Math.sqrt(m); i++){
                        if(m % i == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime){
                        System.out.println("Đây là số nguyên tố");
                    } else {
                        System.out.println("Đây không phải số nguyên tố");
                    }
                }
                break;
            case 3:
                System.out.print("Mời bạn nhập số cần kiểm tra: ");
                int k = sc.nextInt();
                if(k % 3 == 0){
                    System.out.println("Đây là số chia hết cho 3");
                } else {
                    System.out.println("Không chia hết cho 3");
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
