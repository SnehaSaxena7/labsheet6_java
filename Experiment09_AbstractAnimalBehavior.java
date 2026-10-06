abstract class Animal {
    abstract void eat();

    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in its den");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the forest");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in a safe place");
    }
}

public class Experiment09_AbstractAnimalBehavior {

    public static void main(String[] args) {

        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }
}