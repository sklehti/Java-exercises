public class Cat extends Animal implements Voicing {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Kissa");
    }

    public void meows () {
        System.out.println(super.getName() + " miukuu");
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
        this.meows();
    }
}
