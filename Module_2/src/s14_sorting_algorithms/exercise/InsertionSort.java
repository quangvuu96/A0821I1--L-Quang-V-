package s14_sorting_algorithms.exercise;

public class InsertionSort {
    static int[] list = {2, 1, 4, 6, 13, 16, 12, 0, 13, 5, 1, 2, 45};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length;i++) {
            System.out.print(list[i] + " ");
        }
    }
}
