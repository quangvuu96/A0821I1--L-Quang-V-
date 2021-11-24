package s10_dsa_array.exercise;

public class Test {
    public static void main(String[] args) {
        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(0,21);
        arrayList.add(1,11);
        arrayList.add(2,10);
        arrayList.add(2,6);
        arrayList.add(2, 23);
        arrayList.remove(2);
        System.out.println(arrayList.contains(6));
        System.out.println(arrayList.indexOf(3));


    }
}
