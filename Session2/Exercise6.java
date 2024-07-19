package Session2;

public class Exercise6 {
    public static void main(String[] args) {
        //tìm số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11.
        int i = 1;
        while(true){
            if(i % 5 == 0 && i % 7 == 0 && i % 11 == 0){
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là: " + i);
                break;
            }
            i++;
        }
    }
}
