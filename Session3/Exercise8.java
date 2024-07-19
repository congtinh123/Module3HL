package Session3;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //đếm số lần xuất hiện trong mảng
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 8, 9, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tim: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("Số " + num + " xuất hiện " + count + " lần trong mảng.");
    }
}
