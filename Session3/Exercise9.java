package Session3;

public class Exercise9 {
    public static void main(String[] args) {
        //tìm phần tử lớn thứ hai trong mảng
        int[] arr = {1, 2, 3, 8, 5, 6, 5, 2, 8, 10};
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondMax);
    }
}
