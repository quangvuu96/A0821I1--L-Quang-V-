package s4_class_and_object.exercise.stop_watch;

import java.time.LocalTime;

public class Main {
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1;i++) {
            for (int j = i + 1; j < array.length ; j++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length;i++) {
            array[i] = (int)(Math.random()*1000);
        }

        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start,end);
        System.out.println("Time : " + stopWatch.getElapsedTime());
    }
}
