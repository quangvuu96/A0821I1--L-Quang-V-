package s5_access_modifier.practice.staticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3" , " Skyactic 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mercedes C300" , " M274");
        System.out.println(Car.numberOfCars);
    }
}
