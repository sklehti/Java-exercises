import java.util.ArrayList;
import java.util.Collection;

public class LosingBox extends Box {
    private Collection<Goods> list;

    public LosingBox () {
        this.list = new ArrayList<>();
    }
    @Override
    public void add(Goods goods) {
        this.list.add(goods);
    }

    @Override
    public boolean IsInTheBox(Goods goods) {
        return false;
    }
}
