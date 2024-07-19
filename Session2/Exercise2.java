package Session2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) { 
        //nhập vào 1 số, kiểm tra xem số đó có chia hết cho 3 và 5 không, chia hết cho 3 không, chia hết cho 5 không
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //chia hết cho 3 và 5,chir chia heets cho 3,chir chuia heets cho 5
        if( num % 3 == 0 && num % 5 ==0){
            System.out.println("Chia hết cho 3 và 5:" + num);
        }else if(num % 3 == 0){
            System.out.println("Chỉ chia hết cho 3:" + num);
        }else if(num % 5 == 0){
            System.out.println("Chỉ chia hết cho 5:" + num);
        }else{
            System.out.println("Không chia hết cho 3 và 5:" + num);
        }
    }
    
}
