package Session3;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //cho mảng có sẵn và nhập vào vị trí phần tử cần xoá
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào vị trí phần tử cần xoá: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= arr.length) {
            System.out.println("Vị trí nhập vào không hợp lệ");
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
}
