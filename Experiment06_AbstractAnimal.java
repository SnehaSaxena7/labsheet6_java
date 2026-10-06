abstract class AbstractAnimal06 {
    abstract void sound();
}

class Lion06 extends AbstractAnimal06 {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger06 extends AbstractAnimal06 {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}

public class Experiment06_AbstractAnimal {
    public static void main(String[] args) {

        AbstractAnimal06 lion = new Lion06();
        AbstractAnimal06 tiger = new Tiger06();

        lion.sound();
        tiger.sound();
    }
}