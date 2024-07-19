package Session3;

public class Exercise4 {
    public static void main(String[] args) {
        //tìm phần tử lớn nhất trong mảng hai chiều
        int[][] arr = {
                    {1, 9, 3},
                {4, 5, 7},
                {7, 5, 4}
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
