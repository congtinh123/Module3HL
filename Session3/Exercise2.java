package Session3;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //cho mảng và thêm phần tử vào vị trí muốn cho thêm vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập vào vị trí muốn thêm phần tử vào: ");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length) {
            System.out.println("Vị trí nhập vào không hợp lệ");
        } else {
            System.out.println("Nhập vào phần tử muốn thêm vào: ");
            int value = sc.nextInt();
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = value;
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
}
