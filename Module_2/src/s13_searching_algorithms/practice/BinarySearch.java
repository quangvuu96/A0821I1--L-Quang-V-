package s13_searching_algorithms.practice;

public class BinarySearch {
    static int[] list = {2, 4, 6, 7, 8, 10, 15, 18, 19, 20, 28, 29, 40, 50, 60, 68};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low)/2;
            if(key < list[mid]) high = mid - 1;
            else if (key == list[mid]) return mid;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 10));
    }
}
