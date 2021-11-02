package s3_array_and_method.exercise;

public class CombineArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] array = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            array[i] = arr1[i];
        }

        for (int i = 0; i < length2; i++) {
            array[length1 + i] = arr2[i];
        }

        System.out.print("New array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
