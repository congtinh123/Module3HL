package Session2;

public class Exercise7 {
    public static void main(String[] args) {
        // hiển thị 20 số nguyên tố đầu tiên
        int count = 0;
        int i = 2;
        while(count < 20){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    //kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
