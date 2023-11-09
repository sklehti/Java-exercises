public class Dog extends Animal implements Voicing {
    public Dog(String name) {
        super(name);
    }

    public Dog () {
        super("Koira");
    }

    public void bark () {
        System.out.println(super.getName() + " haukkuu");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void voice() {
        this.bark();
    }
}
