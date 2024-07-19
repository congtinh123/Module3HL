package Session3;

public class Exercise5 {
    public static void main(String[] args) {
        //tìm giá trị nhỏ nhất trong mảng
        int[] arr = {3, 2, 1, 4, 5};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
