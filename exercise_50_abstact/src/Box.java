import java.util.Collection;

public abstract class Box {

    public abstract void add (Goods goods);

    public void add (Collection<Goods> goods) {
        for (Goods g: goods) {
            add(g);
        }
    }

    public abstract boolean IsInTheBox (Goods goods);
}
