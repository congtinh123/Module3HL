package Session3;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        //tính tổng số ở cột xác định

        //Nhập số hàng và số cột
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row =  sc.nextInt(); 
        System.out.print("Nhập số cột: ");
        int col = sc.nextInt();

        //khai báo mảng và nhập giá trị mảng hai chiều
        double[][] array = new double[row][col];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        //In ra mảng hai chiều
        System.out.println("Mảng 2 chiều vừa nhập:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //khai báo một biến để kiểm tra xem cột nhập có nằm ngoài giá trị cột của mảng hay không
        //tính tổng
        int sum = 0;
        System.out.print("Nhập số cột cần tính tổng: ");
        int y = sc.nextInt();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(j == y){
                    sum += array[i][y];
                }
            }
        }
        System.out.print("Tổng cột" + y + "là:" + sum);
    }
}
