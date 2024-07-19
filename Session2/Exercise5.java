package Session2;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Nhập vào 2 số, tính tổng các số chẵn trong khoảng từ số đầu đến số cuối.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số đầu: ");
        int start = sc.nextInt();
        System.out.print("Nhập số cuối: ");
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
    }
}
