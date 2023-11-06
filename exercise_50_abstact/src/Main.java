/**
 * Note! The main difference between interfaces and abstract classes is that abstract classes
 * allow you to define not only methods, but also object-variables and constructors.
 * Because abstract classes can be used to define functionality, they can be used to define
 * default functionality, for example.
 *
 */

public class Main {
    public static void main(String[] args) {
        LosingBox box = new LosingBox();
        box.add(new Goods("Saludo", 5));
        box.add(new Goods("Pirkka", 5));

        System.out.println(box.IsInTheBox(new Goods("Saludo")));
        System.out.println(box.IsInTheBox(new Goods("Pirkka")));


    }
}