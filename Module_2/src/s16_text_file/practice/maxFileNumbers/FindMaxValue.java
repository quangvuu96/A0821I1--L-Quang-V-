package s16_text_file.practice.maxFileNumbers;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s16_text_file\\practice\\maxFileNumbers\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s16_text_file\\practice\\maxFileNumbers\\results.txt",maxValue);
    }
}
