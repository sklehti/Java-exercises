public class Main {
    public static void main(String[] args) {
       Voicing dog = new Dog();
       dog.voice();

       Voicing cat = new Cat("Karvinen");
       cat.voice();
       Cat c = (Cat) cat;
       c.meows();
    }
}