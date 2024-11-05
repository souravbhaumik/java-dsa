package myArr.Exercise;

public class MyArray {
    public static int[] middle(int[] arr) {
        int[] newArr = null;
        if (arr.length > 2) {
            for (int i=1; i<arr.length-1; i++){
                newArr[i-1] = arr[i];
            }
            return newArr;
        }
        return newArr;
    }

}
