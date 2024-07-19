package Session03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
//     C2:   int [] arr2 = new int[10];
//    Display array
//        display(arr);
//        Add array
//        addNumber(arr,5,2);
//        deleteNumber(arr,2);
        updateNumber(arr,2,10);
    }

    public static void display(int [] arr){
        for (int ele : arr) System.out.print(ele+ " ");
//        System.out.println(Arrays.toString(arr));
    }

    public static void addNumber(int [] arr,int num, int index){
        if(index<0 || index >= arr.length ){
            throw new IndexOutOfBoundsException();
        }
       int [] newArr = new int[arr.length+1]; // 6
//    arr   :    1,2,3,4,3   -> 5
//    newArr:    1 2 5 3 4 3 -> 6
//        num = 5, index = 2
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
//        2 3 4
        newArr[index] = num;
        arr = newArr;
        display(arr);
    }

    public static void deleteNumber(int [] arr, int index) {
        if(index<0 || index >= arr.length ){
            throw new IndexOutOfBoundsException();
        }
        //    arr   :    1,2,3,4,3   -> 5
        //   newArr:     1 2 4 3
        int [] newArr = new int[arr.length-1];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }

        for(int i = index ; i < newArr.length; i++){
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        display(arr);
    }

    public static void updateNumber(int [] arr, int index,int num) {
        if(index<0 || index >= arr.length ){
            throw new IndexOutOfBoundsException();
        }
        arr[index] = num;
        display(arr);
    }
}
