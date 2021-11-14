package s7_abtract_class_interface.practice.interfaceEdibleAnimal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Ò ó o òooo";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
